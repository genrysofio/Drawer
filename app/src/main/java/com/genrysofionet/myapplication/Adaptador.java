package com.genrysofionet.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {

    private Context context;
    private ArrayList<Entidades>listItem;

    public Adaptador(Context context, ArrayList<Entidades> listItem) {
        this.context = context;
        this.listItem = listItem;
    }

    @Override
    public int getCount() {
        return listItem.size();
    }

    @Override
    public Object getItem(int i) {
        return listItem.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        Entidades Item=(Entidades)getItem(i);

        view= LayoutInflater.from(context).inflate(R.layout.item,null);
        TextView titulo=(TextView)view.findViewById(R.id.titulo);
        ImageView imgFoto=(ImageView)view.findViewById(R.id.imagen);
        TextView nombre=(TextView)view.findViewById(R.id.nombre);
        TextView poder=(TextView)view.findViewById(R.id.poder);

        titulo.setText(Item.getTitulo_item());
        imgFoto.setImageResource(Item.getImageFoto());
        nombre.setText(Item.getNombre_item());
        poder.setText(Item.getPoder_item());

        return view;
    }
}
