package com.ifsc.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText editLetra = findViewById(R.id.editLetra);
        EditText editNumero = findViewById(R.id.editNumero);
        Button buttonEnviar = findViewById(R.id.buttonEnviar);

        buttonEnviar.setOnClickListener(view -> {

            String letra = editLetra.getText().toString();
            String numero = editNumero.getText().toString();

            Intent intentExplicita = new Intent(MainActivity.this, MainActivityB.class);
            intentExplicita.putExtra("letra", letra);
            startActivity(intentExplicita);


            Intent intentImplicita = new Intent("ENVIAR_NUMERO");
            intentImplicita.putExtra("numero", numero);
            startActivity(intentImplicita);
        });
    }
}