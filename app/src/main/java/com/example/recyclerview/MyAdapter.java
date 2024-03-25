package com.example.recyclerview;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> implements View.OnClickListener {

    private Context context;
    private List<item> items;

    public MyAdapter(Context context, List<item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_view, parent, false);
        view.setOnClickListener(this); // Tambahkan onClickListener di sini
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.nameView.setText(items.get(position).getName());
        holder.emailView.setText(items.get(position).getEmail());
        holder.imageView.setImageResource(items.get(position).getImage());

        // Tambahkan tag ke setiap item untuk identifikasi di onClick
        holder.itemView.setTag(position);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public void onClick(View v) {
        int position = (int) v.getTag(); // Dapatkan posisi item yang diklik
        item clickedItem = items.get(position); // Dapatkan objek item yang sesuai

        // Buat Intent untuk membawa data ke DetailActivity
        Intent intent = new Intent(context, DetailActivity.class);
        intent.putExtra("name", clickedItem.getName());
        intent.putExtra("nim", clickedItem.getEmail());
        intent.putExtra("image", clickedItem.getImage()); // tambahkan data foto

        // Tambahkan flag FLAG_ACTIVITY_NEW_TASK
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        // Gunakan konteks aktivitas untuk memulai aktivitas baru
        context.startActivity(intent);
    }
}