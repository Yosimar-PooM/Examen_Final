package com.example.examen_final;

import org.json.JSONException;

public class Paises {
    private String nombre;
    private String urlPdf;
    private String codigo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String titulo) {
        this.nombre = titulo;
    }

    public String getUrlPdf() {
        return urlPdf;
    }

    public void setUrlPdf(String urlPdf) {
        this.urlPdf = urlPdf;
    }
    public Paises() throws JSONException {

        }

    public Paises(String title, String url){
        nombre = title;
        urlPdf=url;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Paises(String nombre, String urlPdf, String codigo) {
        this.nombre = nombre;
        this.urlPdf = urlPdf;
        this.codigo = codigo;
    }
}
