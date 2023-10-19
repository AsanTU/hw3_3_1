package com.example.hw3_3mon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> contactNameList = new ArrayList<>();
    private RecyclerView rvContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findId();
        findAdapter();
        loadData();
    }

    private void findId() {
        rvContact = findViewById(R.id.rv_contacts);
    }
    private void findAdapter(){
        ContactAdapter adapter = new ContactAdapter(contactNameList);
        rvContact.setAdapter(adapter);
    }

    private void loadData(){
        contactNameList.add("Леха");
        contactNameList.add("Бека");
        contactNameList.add("Денис");
        contactNameList.add("Нурик");
        contactNameList.add("Ислам");
        contactNameList.add("Иман");
        contactNameList.add("Мира");
        contactNameList.add("Мара");
        contactNameList.add("Лада");
        contactNameList.add("Данко");
    }
}