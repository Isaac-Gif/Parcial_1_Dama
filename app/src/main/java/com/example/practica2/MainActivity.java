package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.practica2.Controllers.ReproductorMusicAdapter;
import com.example.practica2.Models.Music;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerMusic;
    private ArrayList<Music> listaMusica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInitComponents();
        addSoundList();
        setAdapterMusic();
    }

    private void setAdapterMusic() {
        ReproductorMusicAdapter adapter = new ReproductorMusicAdapter(listaMusica, this);
        recyclerMusic.setAdapter(adapter);
    }

    private void addSoundList() {
        listaMusica = new ArrayList<>();

        listaMusica.add(
                new Music(
                        "Todavía - Tainy, Wisin Y Yandel.",
                        "DATA",
                        R.raw.todavia,
                        R.drawable.data
                )
        );

        listaMusica.add(
                new Music(
                        "FANTASMA | AVC - Tainy, JhayCo",
                        "DATA",
                        R.raw.fantasma,
                        R.drawable.data
                )
        );

        listaMusica.add(
                new Music(
                        "LA SANTA - BAD BUNNY x DADDY YANKEE ",
                        "YHLQMDLG",
                        R.raw.lasanta,
                        R.drawable.yhlqmdlg
                )
        );

        listaMusica.add(
                new Music(
                        "Columbia - Quevedo",
                        "Columbia",
                        R.raw.columbia,
                        R.drawable.columbia
                )
        );

        listaMusica.add(
                new Music(
                        " Adicto - Tainy, Anuel AA, Ozuna",
                        "Adicto",
                        R.raw.adicto,
                        R.drawable.adicto
                )
        );
    }

    private void setInitComponents() {
        recyclerMusic = findViewById(R.id.recyclerMusic);
        recyclerMusic.setLayoutManager(new LinearLayoutManager(this));
    }
}