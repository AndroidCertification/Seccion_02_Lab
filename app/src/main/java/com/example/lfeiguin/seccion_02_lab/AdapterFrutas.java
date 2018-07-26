package com.example.lfeiguin.seccion_02_lab;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AdapterFrutas extends BaseAdapter {

    private Context context;
    private int layout;
    private List<String> frutas;

    public AdapterFrutas(Context context, int layout, List<String> frutas){
        this.context = context;
        this.layout = layout;
        this.frutas = frutas;
    }

    @Override
    public int getCount() {
        return this.frutas.size();
    }

    @Override
    public Object getItem(int position) {
        return this.frutas.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        v = layoutInflater.inflate(R.layout.list_item_fruta, null);

        String  frutaActual = frutas.get(position);
        TextView textView = (TextView) v.findViewById(R.id.textView);
        textView.setText(frutaActual);

        return v;
    }
}
