package com.steven.app.controller;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.steven.app.R;
import com.steven.app.model.Datos;
import com.steven.app.model.Manager;

public class MainActivity extends AppCompatActivity {

    Manager manager;
    EditText edtTipoactividad, edtCantidad, edtEmisionesco2, edtFecha, ;
    Button btnRegistrar, btncalcula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTipoactividad = findViewById(R.id.edtTipoactividad);
        edtCantidad = findViewById(R.id.edtCantidad);
        edtEmisionesco2 = findViewById(R.id.edtEmisionesCO2);
        edtFecha = findViewById(R.id.edtFecha);
        btnRegistrar = findViewById(R.id.btnRegistrar);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                manager = new Manager(MainActivity.this);

                String tipoactividad = edtTipoactividad.getText().toString();
                String cantidad = edtCantidad.getText().toString();
                String emisionesco2 = edtEmisionesco2.getText().toString();
                String fecha = edtFecha.getText().toString();

                Datos datos = new Datos(tipoactividad,cantidad ,emisionesco2, fecha);
                long resultado = manager.insertData(datos);

                if (resultado > 0) {
                    Toast.makeText(MainActivity.this, "Datos insertados", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Error al insertar datos", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void CalcularValor() {
        rgproductos =  findViewById(R.id.rgproductos);
        edt =  findViewById(R.id.);
        rbradio = (RadioButton) findViewById(R.id.rbradio);
        btncalcula = (Button) findViewById(R.id.btcalcula);
        total = (EditText) findViewById(R.id.edtotal);

        rgproductos.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(@NonNull RadioGroup radioGroup, int checkedid) {
                switch (checkedid) {
                    case R.id.edt:
                        precios = 0.21;
                        precio.setText("" + precios);
                        break;

                    case R.id.rbradio:
                        precios = 0.38;
                        precio.setText("" + precios);
                        break;

                    case R.id.rbradio:
                        precios = 2.5;
                        precio.setText("" + precios);
                }
            }

}