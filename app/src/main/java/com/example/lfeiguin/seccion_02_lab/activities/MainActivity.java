package com.example.lfeiguin.seccion_02_lab.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.lfeiguin.seccion_02_lab.R;
import com.example.lfeiguin.seccion_02_lab.adapters.AdapterFrutas;
import com.example.lfeiguin.seccion_02_lab.models.Fruta;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listViewFrutas;
    private List<Fruta> frutasList;
    private int counter = 0;
    private AdapterFrutas adapterFrutas;

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

        adapterFrutas = new AdapterFrutas(this, R.layout.list_item_fruta, frutasList);
        listViewFrutas.setAdapter(adapterFrutas);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_bar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.add_item:
                this.frutasList.add((new Fruta("New " + (++counter), R.mipmap.ic_new_fruit, "New city")));
                this.adapterFrutas.notifyDataSetChanged();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}


