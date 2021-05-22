package com.example.appemi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class colores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colores);
    }
    public void numeros (View view){
        switch (view.getId()){
            case R.id.uno:
                MediaPlayer uno = MediaPlayer.create(this,R.raw.uno);
                uno.start();
                break;
            case R.id.dos:
                MediaPlayer dos = MediaPlayer.create(this,R.raw.dos);
                dos.start();
                break;
            case R.id.tres:
                MediaPlayer tres = MediaPlayer.create(this,R.raw.tres);
                tres.start();
                break;
            case R.id.cuatro:
                MediaPlayer cuatro = MediaPlayer.create(this,R.raw.cuatro);
                cuatro.start();
                break;
            case R.id.cinco:
                MediaPlayer cinco = MediaPlayer.create(this,R.raw.cinco);
                cinco.start();
                break;
            case R.id.seis:
                MediaPlayer seis = MediaPlayer.create(this,R.raw.seis);
                seis.start();
                break;
            case R.id.siete:
                MediaPlayer siete = MediaPlayer.create(this,R.raw.siete);
                siete.start();
                break;
            case R.id.ocho:
                MediaPlayer ocho = MediaPlayer.create(this,R.raw.ocho);
                ocho.start();
                break;
            case R.id.nueve:
                MediaPlayer nueve = MediaPlayer.create(this,R.raw.nueve);
                nueve.start();
                break;
            case R.id.diez:
                MediaPlayer diez = MediaPlayer.create(this,R.raw.diez);
                diez.start();
                break;
        }
    }

    public void atras (View view){
        Intent atras = new Intent(this, MainActivity.class);
        startActivity(atras);
    }

}