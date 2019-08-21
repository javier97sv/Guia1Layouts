package com.example.layoutsitents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Calculadora extends AppCompatActivity implements View.OnClickListener{

    Button btnMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        btnMenu = findViewById(R.id.btnMenu);
        btnMenu.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        this.finish();
    }
}
