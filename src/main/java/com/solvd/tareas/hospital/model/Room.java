package com.solvd.tareas.hospital.model;

public class Room {
    private String position;
    private double width;
    private double length;

    public Room() {
    }

    public Room(String position, double width, double length) {
        this.position = position;
        this.width = width;
        this.length = length;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
