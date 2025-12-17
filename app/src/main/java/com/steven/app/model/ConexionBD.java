package com.steven.app.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;


public class ConexionBD extends SQLiteOpenHelper {
    public ConexionBD(@Nullable Context context) {
        super(context, Constantes.NAME_BD, null, Constantes.VERSION_BD);
    }

    @Override
    public void onCreate(SQLiteDatabase recuperacion) {

        recuperacion.execSQL("CREATE TABLE DATOS(TIPOACTIVIDAD TEXT, CANTIDAD TEXT, EMISIONESCO2 TEXT, FECHA TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
