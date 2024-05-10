package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private ListView lv;
    private  String[] cities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cities = getResources().getStringArray(R.array.cities);
        ArrayAdapter<String> a = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_dropdown_item, cities);
        lv = (ListView) findViewById(R.id.ListView);
        lv.setAdapter(a);
        lv.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView output = (TextView) findViewById(R.id.lblOutput);
        output.setText("你是住在: " + cities[position]);
    }

}