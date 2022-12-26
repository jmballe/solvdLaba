package com.solvd.tareas.hospital.model;

public class Room {
    private String area;
    private String floor;
    private int capacity;

    public Room() {
    }

    public Room(String area,String floor, int capacity) {
        this.area = area;
        this.floor = floor;
        this.capacity = capacity;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
