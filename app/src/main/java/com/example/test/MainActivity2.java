package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String arr[]={"Mumbai", "Daman", "Surat"};
        ListAdapter ls= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arr);
        ListView iv=(ListView) findViewById(R.id.listview);
        iv.setAdapter(ls);
    }


}