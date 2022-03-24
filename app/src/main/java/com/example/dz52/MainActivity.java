package com.example.dz52;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ContactAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler_view);
        ArrayList<String> contacts=new ArrayList<>();
        contacts.add("705345645(Aкыл)");
        contacts.add("705345645(Aкыл)");
        contacts.add("705345645(Aкыл)");
        contacts.add("705345645(Aкыл)");
        contacts.add("705345645(Aкыл)");
        contacts.add("705345645(Aкыл)");
        contacts.add("705345645(Aкыл)");
        contacts.add("705345645(Aкыл)");
        contacts.add("705345645(Aкыл)");
        contacts.add("705345645(Aкыл)");
        contacts.add("705345645(Aкыл)");
        contacts.add("705345645(Aкыл)");
        contacts.add("705345645(Aкыл)");
        contacts.add("705345645(Aкыл)");
        contacts.add("705345645(Aкыл)");
        contacts.add("705345645(Aкыл)");
        contacts.add("705345645(Aкыл)");


      adapter=new ContactAdapter(contacts);
      recyclerView.setAdapter(adapter);


    }

}