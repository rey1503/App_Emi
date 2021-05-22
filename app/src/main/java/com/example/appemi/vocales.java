package com.example.appemi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class vocales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocales);
    }
    public void vocal (View view){
        switch (view.getId()){
            case R.id.avion:
                MediaPlayer avion = MediaPlayer.create(this,R.raw.avion);
                avion.start();
                Toast.makeText(this,"Avion",Toast.LENGTH_SHORT).show();
                break;
            case R.id.elefantes:
                MediaPlayer elefante = MediaPlayer.create(this,R.raw.elefantevocal);
                elefante.start();
                Toast.makeText(this,"Elefante",Toast.LENGTH_SHORT).show();
                break;
            case R.id.iglesia:
                MediaPlayer iglesia = MediaPlayer.create(this,R.raw.iguana);
                iglesia.start();
                Toast.makeText(this,"Iglesia",Toast.LENGTH_SHORT).show();
                break;
            case R.id.oso:
                MediaPlayer oso = MediaPlayer.create(this,R.raw.osovocal);
                oso.start();
                Toast.makeText(this,"Oso",Toast.LENGTH_SHORT).show();
                break;
            case R.id.uva:
                MediaPlayer uva = MediaPlayer.create(this,R.raw.uvas);
                uva.start();
                Toast.makeText(this,"Uva",Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void atra (View view){
        Intent atra = new Intent(this, MainActivity.class);
        startActivity(atra);
    }
}