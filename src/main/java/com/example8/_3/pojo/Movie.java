package com.example8._3.pojo;

import com.fasterxml.jackson.annotation.JsonAlias;

public class Movie {
    @JsonAlias("Title")
    private String title;
    @JsonAlias("Year")
    private int year;
    private String imdbID;

    public Movie() {
    }

    public Movie(String title, int year, String imdbID) {
        this.title = title;
        this.year = year;
        this.imdbID = imdbID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getImdbID() {
        return imdbID;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }
}
