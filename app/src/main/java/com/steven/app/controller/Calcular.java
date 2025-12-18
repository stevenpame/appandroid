package com.steven.app.controller;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.steven.app.R;

public class Calcular extends AppCompatActivity {

    EditText edtTransporte, edtComida, edtEnergia;
    TextView edtResultado1, edtResultado2, edtResultado3;
    Button btncalcula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calcular);

        edtTransporte = findViewById(R.id.transporte);
        edtComida = findViewById(R.id.comida);
        edtEnergia = findViewById(R.id.energia);
        btncalcula = findViewById(R.id.btncalcula);
        edtResultado1 = findViewById(R.id.edtResultado1);
        edtResultado2 = findViewById(R.id.edtResultado2);
        edtResultado3 = findViewById(R.id.edtResultado3);

        btncalcula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularHuella();
            }
        });
    }

    private void calcularHuella() {
        double transporte = Double.parseDouble(edtTransporte.getText().toString()) * 0.21;
        double comida = Double.parseDouble(edtComida.getText().toString()) * 0.38;
        double energia = Double.parseDouble(edtEnergia.getText().toString()) * 2.5;

        edtResultado1.setText(String.format("%.2f", transporte));
        edtResultado2.setText(String.format("%.2f", comida));
        edtResultado3.setText(String.format("%.2f", energia));
    }
}
