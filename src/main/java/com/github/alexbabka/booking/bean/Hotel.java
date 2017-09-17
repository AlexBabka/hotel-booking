package com.github.alexbabka.booking.bean;

public class Hotel {
    private String name;
    private String location;

    public Hotel() {
    }

    public Hotel(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
