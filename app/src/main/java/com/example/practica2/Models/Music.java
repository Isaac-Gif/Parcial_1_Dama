package com.example.practica2.Models;

public class Music {
    private String nameMusic;
    private String nameAlbum;
    private int musicMP3;
    private int imageAlbum;


    public Music(String nameMusic, String nameAlbum, int musicMP3, int imageAlbum) {
        this.nameMusic = nameMusic;
        this.nameAlbum = nameAlbum;
        this.musicMP3 = musicMP3;
        this.imageAlbum = imageAlbum;
    }

    public String getNameMusic() {
        return nameMusic;
    }

    public void setNameMusic(String nameMusic) {
        this.nameMusic = nameMusic;
    }

    public String getNameAlbum() {
        return nameAlbum;
    }

    public void setNameAlbum(String nameAlbum) {
        this.nameAlbum = nameAlbum;
    }

    public int getMusicMP3() {
        return musicMP3;
    }

    public void setMusicMP3(int musicMP3) {
        this.musicMP3 = musicMP3;
    }

    public int getImageAlbum() {
        return imageAlbum;
    }

    public void setImageAlbum(int imageAlbum) {
        this.imageAlbum = imageAlbum;
    }
}
