package com.example.cvolk.carfragments.model;

import android.os.Parcelable;

import java.io.Serializable;

public class Car implements Serializable {

    private String year;
    private String make;
    private String model;
    private String color;

    public Car(String year, String make, String model, String color) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color + " " +
                year + " " +
                make + " " +
                model;
    }
}
