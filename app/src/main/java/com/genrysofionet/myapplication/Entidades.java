package com.genrysofionet.myapplication;

import android.media.Image;

public class Entidades {
    private String titulo_item;
    private int imageFoto;
    private String nombre_item;
    private String poder_item;

    public Entidades(String titulo_item, int imageFoto, String nombre_item, String poder_item) {
        this.titulo_item = titulo_item;
        this.imageFoto = imageFoto;
        this.nombre_item = nombre_item;
        this.poder_item = poder_item;
    }

    public String getTitulo_item() {
        return titulo_item;
    }


    public int getImageFoto() {
        return imageFoto;
    }


    public String getNombre_item() {
        return nombre_item;
    }


    public String getPoder_item() {
        return poder_item;
    }

}
