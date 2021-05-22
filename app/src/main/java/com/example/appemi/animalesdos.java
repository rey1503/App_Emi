package com.example.appemi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class animalesdos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animalesdos);
    }
    public void vocaluno (View view){
        switch (view.getId()){
            case R.id.mono:
                MediaPlayer mono = MediaPlayer.create(this,R.raw.mono);
                mono.start();
                break;
            case R.id.mosca:
                MediaPlayer mosca = MediaPlayer.create(this,R.raw.mosca);
                mosca.start();
                break;
            case R.id.oveja:
                MediaPlayer oveja = MediaPlayer.create(this,R.raw.oveja);
                oveja.start();
                break;
            case R.id.pato:
                MediaPlayer pato = MediaPlayer.create(this,R.raw.pato);
                pato.start();
                break;
            case R.id.pavo:
                MediaPlayer pavo = MediaPlayer.create(this,R.raw.pavo);
                pavo.start();
                break;
            case R.id.perro:
                MediaPlayer perro = MediaPlayer.create(this,R.raw.perro);
                perro.start();
                break;
            case R.id.pollo:
                MediaPlayer pollo = MediaPlayer.create(this,R.raw.pollito);
                pollo.start();
                break;
            case R.id.rana:
                MediaPlayer rana = MediaPlayer.create(this,R.raw.rana);
                rana.start();
                break;
            case R.id.serpiente:
                MediaPlayer serpiente = MediaPlayer.create(this,R.raw.serpiente);
                serpiente.start();
                break;
            case R.id.toro:
                MediaPlayer toro = MediaPlayer.create(this,R.raw.toro);
                toro.start();
                break;
            case R.id.vaca:
                MediaPlayer vaca = MediaPlayer.create(this,R.raw.vaca);
                vaca.start();
                break;
        }
    }
    public void menu (View view){
        Intent menu = new Intent(this, MainActivity.class);
        startActivity(menu);
    }
    public void atras (View view){
        Intent atras = new Intent(this, animales.class);
        startActivity(atras);
    }
}