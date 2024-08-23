package com.example8._3.pojo;

public class MovieCount {
    private int year;
    private int count;

    public MovieCount() {}

    public MovieCount(int year, int count) {
        this.year = year;
        this.count = count;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
