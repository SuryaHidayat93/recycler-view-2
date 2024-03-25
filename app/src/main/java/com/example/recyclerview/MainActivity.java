package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        List<item> items = new ArrayList<item>();
        items.add(new item("Abmi Sukma Edri","12250120341",R.drawable.amiii));
        items.add(new item("Ahmad Kurniawan","12250111514",R.drawable.ahmed));
        items.add(new item("Aufa Hajati","12250120338",R.drawable.aufa));
        items.add(new item("Daffa Finanda","12250111603",R.drawable.a));
        items.add(new item("Daffa Ikhwan","12250110979",R.drawable.dafuq));
        items.add(new item("Dwi Jelita Adhiliyah","1225012331",R.drawable.jelita));
        items.add(new item("Dwi Mahdini","12250111298",R.drawable.dwik));
        items.add(new item("Fajri","12250110382",R.drawable.fajri));
        items.add(new item("Fakhri","12250111381",R.drawable.fakhri));
        items.add(new item("Farras Latief","12250111328",R.drawable.farras));
        items.add(new item("Gilang Ramadhan Indra","12250111323",R.drawable.gilang));
        items.add(new item("Hafidz Alhadid Rahman","12250111795",R.drawable.hafidz));
        items.add(new item("M. Nabil Dawami","12250111527",R.drawable.nabil));
        items.add(new item("Muh. Zaky Erbai Syas","12250111134",R.drawable.zaki));
        items.add(new item("Haritsah Naufaldy","12250110361",R.drawable.aldy));
        items.add(new item("Muhammad Aditya","12250111048",R.drawable.adit));
        items.add(new item("Muhammad dhimas","12250111231",R.drawable.dms));
        items.add(new item("Muhammad Faruq","12250111791",R.drawable.faruqhz));
        items.add(new item("Muhammad Rafly","12250111489",R.drawable.rafly));
        items.add(new item("Nurika Dwi Wahyuni","12250120360",R.drawable.nurika));
        items.add(new item("Ogya Secio","12250111346",R.drawable.ogi));
        items.add(new item("Rahma Laksita","12250110342",R.drawable.rahma));
        items.add(new item("Surya Hidayatullah Firdaus","12250111759",R.drawable.a));




        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));

    }
}