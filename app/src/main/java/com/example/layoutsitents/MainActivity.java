package com.example.layoutsitents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnCalculadora;
    Button btnFormulario;
    Button btnDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCalculadora = findViewById(R.id.btnCalculadora);
        btnCalculadora.setOnClickListener(this);
        btnFormulario = findViewById(R.id.btnFormulario);
        btnFormulario.setOnClickListener(this);
        btnDatos = findViewById(R.id.btnDatos);
        btnDatos.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        procesarBoton(view.getId());
    }

    public void procesarBoton(int opc){
        switch (opc){
            case R.id.btnCalculadora: {
                Intent i = new Intent(this, Calculadora.class);
                startActivity(i);
                break;
            }
            case R.id.btnFormulario: {
                Intent i = new Intent(this, Login.class);
                startActivity(i);
                break;
            }
            case R.id.btnDatos: {
                Intent i = new Intent(this, Datos.class);
                startActivity(i);
                break;
            }
        }
    }
}
