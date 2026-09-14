package com.ifsc.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_b);

        TextView textLetra = findViewById(R.id.textLetra);
        TextView textNumero = findViewById(R.id.textNumero);

        Intent intent = getIntent();

        // Recebe a letra da Intent explícita
        String letra = intent.getStringExtra("letra");

        // Recebe o número da Intent implícita
        String numero = intent.getStringExtra("numero");

        if (letra != null) {
            textLetra.setText("Letra recebida: " + letra);
        }

        if (numero != null) {
            textNumero.setText("Número recebido: " + numero);
        }
    }
}