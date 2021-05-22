package com.example.appemi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void colores (View view){
        Intent colores = new Intent(this, colores.class);
        startActivity(colores);
    }
    public void vocales (View view){
        Intent vocales = new Intent(this, vocales.class);
        startActivity(vocales);
    }
    public void animales (View view){
        Intent animales = new Intent(this, animales.class);
        startActivity(animales);
    }
}