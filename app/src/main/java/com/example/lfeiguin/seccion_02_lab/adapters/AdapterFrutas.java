package com.example.lfeiguin.seccion_02_lab.adapters;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lfeiguin.seccion_02_lab.R;
import com.example.lfeiguin.seccion_02_lab.models.Fruta;

import java.util.List;

public class AdapterFrutas extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Fruta> frutaList;

    public AdapterFrutas(Context context, int layout, List<Fruta> frutaList){
        this.context = context;
        this.layout = layout;
        this.frutaList = frutaList;
    }

    @Override
    public int getCount() {
        return this.frutaList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.frutaList.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            LayoutInflater layoutInflater = LayoutInflater.from(this.context);
            convertView = layoutInflater.inflate(R.layout.list_item_fruta, null);

            holder = new ViewHolder();
            holder.txtNombre = (TextView) convertView.findViewById(R.id.txtNombre);
            holder.txtCiudad = (TextView) convertView.findViewById(R.id.txtCiudad);
            holder.imageView = (ImageView) convertView.findViewById(R.id.imageView);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        String  frutaActual = frutaList.get(position).getNombre();
        holder.txtNombre.setText(frutaActual);

        String ciudadActual = frutaList.get(position).getCiudad();
        holder.txtCiudad.setText(ciudadActual);

        int imagenActual = frutaList.get(position).getIcono();
        holder.imageView.setImageResource(imagenActual);

        return convertView;
    }

    static class ViewHolder{
        private TextView txtNombre;
        private TextView txtCiudad;
        private ImageView imageView;
    }
}
