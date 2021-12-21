package com.example.soal_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Contact> contactList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        setData();
    }

    private void setData() {
        Contact dataBatman   = new Contact("Batman Aja", "+62 89 890 237 672", " ", R.drawable.cow);
        Contact dataMardiana = new Contact("Mardiana Azizah", "+62 89 623 382 292", " ", R.drawable.cew);
        Contact dataIzzatul  = new Contact("Izzatul Masruroh", "+62 89 621 387 570", " ", R.drawable.cew);


        contactList.add(dataBatman);
        contactList.add(dataMardiana);
        contactList.add(dataIzzatul);

        RecyclerviewAdapter mAdapter = new RecyclerviewAdapter(contactList, this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);
    }
}

