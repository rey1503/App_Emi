package com.example.appemi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class animales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animales);
    }
    public void vocal (View view){
        switch (view.getId()){
            case R.id.abeja:
                MediaPlayer abeja = MediaPlayer.create(this,R.raw.abeja);
                abeja.start();
                break;
            case R.id.caballo:
                MediaPlayer caballo = MediaPlayer.create(this,R.raw.caballo);
                caballo.start();
                break;
            case R.id.elefantes:
                MediaPlayer elefantes = MediaPlayer.create(this,R.raw.elefante);
                elefantes.start();
                break;
            case R.id.buho:
                MediaPlayer buho = MediaPlayer.create(this,R.raw.buho);
                buho.start();
                break;
            case R.id.cabra:
                MediaPlayer cabra = MediaPlayer.create(this,R.raw.cabra);
                cabra.start();
                break;
            case R.id.gallina:
                MediaPlayer gallina = MediaPlayer.create(this,R.raw.gallina);
                gallina.start();
                break;
            case R.id.burro:
                MediaPlayer burro = MediaPlayer.create(this,R.raw.burro);
                burro.start();
                break;
            case R.id.puerco:
                MediaPlayer puerco = MediaPlayer.create(this,R.raw.chancho);
                puerco.start();
                break;
            case R.id.gallo:
                MediaPlayer gallo = MediaPlayer.create(this,R.raw.gallo);
                gallo.start();
                break;
            case R.id.gato:
                MediaPlayer gato = MediaPlayer.create(this,R.raw.gato);
                gato.start();
                break;
            case R.id.leon:
                MediaPlayer leon = MediaPlayer.create(this,R.raw.leon);
                leon.start();
                break;case R.id.lobo:
                MediaPlayer lobo = MediaPlayer.create(this,R.raw.lobo);
                lobo.start();
                break;
        }
    }
    public void atra (View view){
        Intent atra = new Intent(this, MainActivity.class);
        startActivity(atra);
    }
    public void siguiente (View view){
        Intent sig = new Intent(this, animalesdos.class);
        startActivity(sig);
    }
}