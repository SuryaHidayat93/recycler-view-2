package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {


        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_detail_activityy);

            // Terima data dari Intent
            Intent intent = getIntent();
            String name = intent.getStringExtra("name");
            String nim = intent.getStringExtra("nim");
            int imageResId = intent.getIntExtra("image", R.drawable.a); // default image jika tidak ada gambar

            // Inisialisasi TextViews dan ImageView di layout XML
            TextView nameTextView = findViewById(R.id.detail_name);
            TextView nimTextView = findViewById(R.id.detail_nim);
            ImageView imageView = findViewById(R.id.detail_image);

            // Set nilai TextViews dan ImageView sesuai dengan data yang diterima
            nameTextView.setText(name);
            nimTextView.setText(nim);
            imageView.setImageResource(imageResId);
        }
    }

