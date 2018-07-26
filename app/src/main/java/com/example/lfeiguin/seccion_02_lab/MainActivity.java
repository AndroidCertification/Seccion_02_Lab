package com.example.lfeiguin.seccion_02_lab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        ListView listViewFrutas = (ListView) findViewById(R.id.list_view_frutas);
        List<String> frutas = new ArrayList<String>();
        frutas.add("Manzana");
        frutas.add("Naranja");
        frutas.add("Banana");
        frutas.add("Uva");

       AdapterFrutas adapterFrutas = new AdapterFrutas(this, R.layout.list_item_fruta, frutas);
       listViewFrutas.setAdapter(adapterFrutas);

    }
}


