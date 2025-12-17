package com.steven.app.model;

public class Datos {


    private String tipoActividad;
    private String cantidad;
    private String emisionesCO2;
    private String fecha;

    public Datos(String tpa, String can, String emi, String fec){
        this.tipoActividad = tpa;
        this.cantidad = can;
        this.emisionesCO2 = emi;
        this.fecha = fec;
    }

    public void setTipoActividad(String tipoActividad){
        this.tipoActividad = tipoActividad;
    }
    public  void setCantidad( String cantidad){
        this.cantidad = cantidad;
    }
    public void setEmisionesCO2( String emisionesCO2){this.emisionesCO2 = emisionesCO2;}
    public void setFecha( String fecha){this.fecha = fecha;}

    public String getTipoActividad(){

        return this.tipoActividad;
    }
    public String getCantidad(){

        return this.cantidad;
    }
    public String getEmisionesCO2(){

        return this.emisionesCO2;
    }
    public String getFecha(){

        return this.fecha;
    }
}
