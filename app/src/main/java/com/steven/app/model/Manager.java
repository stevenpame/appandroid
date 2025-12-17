package com.steven.app.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class Manager {

    private ConexionBD conexionBD;
    private SQLiteDatabase recuperacion;

    public Manager (Context context){

        conexionBD = new ConexionBD(context);
    }

    public void openBdWr(){
        recuperacion = conexionBD.getWritableDatabase();
    }
    public void openBdRd(){
        recuperacion = conexionBD.getReadableDatabase();
    }
    public void closeBD(){
        closeBD();
    }
    public long insertData(Datos datos){
        openBdRd();
        ContentValues values = new ContentValues();
        values.put("TIPOACTIVIDAD",datos.getTipoActividad());
        values.put("CANTIDAD",datos.getCantidad());
        values.put("EMISIONESCO2",datos.getEmisionesCO2());
        values.put("FECHA",datos.getFecha());
        long id = recuperacion.insert("DATOS", null, values);

        return id;
    }
}
