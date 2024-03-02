package com.example.practica2.Controllers;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.practica2.Models.Music;
import com.example.practica2.R;

import java.util.ArrayList;

public class ReproductorMusicAdapter
    extends RecyclerView.Adapter<ReproductorMusicAdapter.ViewHolder>
    implements View.OnClickListener
{
    private ArrayList<Music> listaMusica;
    private Context context;
    private View.OnClickListener clickListener;

    public ReproductorMusicAdapter(ArrayList<Music> listaMusica, Context context) {
        this.listaMusica = listaMusica;
        this.context = context;
    }

    public void setOnClickListener(View.OnClickListener clickListener) {
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public ReproductorMusicAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_music_layout, null, false);
        view.setOnClickListener(this);

        return new ReproductorMusicAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReproductorMusicAdapter.ViewHolder holder, int position) {
        holder.textName.setText(listaMusica.get(position).getNameMusic());
        holder.imageAlbum.setImageResource(listaMusica.get(position).getImageAlbum());
        holder.textAlbum.setText(listaMusica.get(position).getNameAlbum());

        holder.mediaPlayer = MediaPlayer.create(
                this.context, listaMusica.get(position).getMusicMP3()
        );

        holder.imageButtonAction.setOnClickListener(view -> {
            if (holder.mediaPlayer.isPlaying()) {
                holder.mediaPlayer.pause();
            } else {
                holder.mediaPlayer.start();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listaMusica.size();
    }

    @Override
    public void onClick(View view) {
        if(clickListener != null){
            clickListener.onClick(view);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textName;
        private TextView textAlbum;
        private ImageView imageAlbum;
        private ImageButton imageButtonAction;
        private MediaPlayer mediaPlayer;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textName = itemView.findViewById(R.id.textViewNameMusic);
            textAlbum = itemView.findViewById(R.id.textViewAlbum);
            imageAlbum = itemView.findViewById(R.id.imageView);
            imageButtonAction = itemView.findViewById(R.id.imageButtonAction);
        }
    }
}
