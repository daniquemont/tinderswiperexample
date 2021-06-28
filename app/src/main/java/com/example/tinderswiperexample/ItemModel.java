package com.example.tinderswiperexample;

public class ItemModel {
    private String movieName;
    private String genre;
    private int movieImage;

    public ItemModel(){

    }

    public ItemModel(int movieImage, String movieName, String genre){
        this.movieImage = movieImage;
        this.movieName = movieName;
        this.genre = genre;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getGenre() {
        return genre;
    }

    public int getMovieImage() {
        return movieImage;
    }

    public void setMovieImage(int movieImage) {
        this.movieImage = movieImage;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
