package com.steven.app.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.steven.app.R;
import com.steven.app.model.Datos;
import com.steven.app.model.Manager;

public class MainActivity extends AppCompatActivity {

    Manager manager;
    EditText edtTipoactividad, edtCantidad, edtFecha;
    TextView txtEmisionesCO2;
    Button btnRegistrar, btnAbrirCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTipoactividad = findViewById(R.id.edtTipoactividad);
        edtCantidad = findViewById(R.id.edtCantidad);
        txtEmisionesCO2 = findViewById(R.id.txtEmisionesCO2);
        edtFecha = findViewById(R.id.edtFecha);
        btnRegistrar = findViewById(R.id.btnRegistrar);
        btnAbrirCalcular = findViewById(R.id.btnAbrirCalcular);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                manager = new Manager(MainActivity.this);

                String tipoactividad = edtTipoactividad.getText().toString();
                String cantidad = edtCantidad.getText().toString();
                String emisionesco2 = "0"; // Valor por defecto
                String fecha = edtFecha.getText().toString();

                Datos datos = new Datos(tipoactividad, cantidad, emisionesco2, fecha);
                long resultado = manager.insertData(datos);

                if (resultado > 0) {
                    Toast.makeText(MainActivity.this, "Datos insertados", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Error al insertar datos", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnAbrirCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Calcular.class);
                startActivity(intent);
            }
        });
    }

}
