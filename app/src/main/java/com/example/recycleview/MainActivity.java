package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.app.AppCompatActivity;

import android.app.LauncherActivity;
import android.app.LauncherActivity.ListItem;
import android.os.Bundle;
import android.app.LauncherActivity.ListItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<Itemlist> items = new ArrayList<Itemlist>();

        for (int i = 1; i <= 10; i++) {
            items.add(new Itemlist("heading " + i + 1, "Test"));

        }

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        adapter = new Itemadapter(items, this);
        recyclerView.setAdapter(adapter);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

}















