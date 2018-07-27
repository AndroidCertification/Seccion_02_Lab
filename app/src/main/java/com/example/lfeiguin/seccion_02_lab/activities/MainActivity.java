package com.example.lfeiguin.seccion_02_lab.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.lfeiguin.seccion_02_lab.R;
import com.example.lfeiguin.seccion_02_lab.adapters.AdapterFrutas;
import com.example.lfeiguin.seccion_02_lab.models.Fruta;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listViewFrutas;
    private List<Fruta> frutasList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        listViewFrutas = (ListView) findViewById(R.id.list_view_frutas);
        frutasList = new ArrayList<Fruta>() {{
            add(new Fruta("Banana", R.mipmap.ic_banana, "Gran Canaria"));
            add(new Fruta("Strawberry", R.mipmap.ic_strawberry, "Huelva"));
            add(new Fruta("Orange", R.mipmap.ic_orange, "Sevilla"));
            add(new Fruta("Apple", R.mipmap.ic_apple, "Madrid"));
            add(new Fruta("Cherry", R.mipmap.ic_cherry, "Galicia"));
            add(new Fruta("Pear", R.mipmap.ic_pear, "Zaragoza"));
            add(new Fruta("Raspberry", R.mipmap.ic_raspberry, "Barcelona"));
        }};

        AdapterFrutas adapterFrutas = new AdapterFrutas(this, R.layout.list_item_fruta, frutasList);
        listViewFrutas.setAdapter(adapterFrutas);
    }
}


