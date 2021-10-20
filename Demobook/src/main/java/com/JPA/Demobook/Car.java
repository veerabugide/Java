package com.JPA.Demobook;

public class Car {
    int id;
    String name;
    String dis;
    public int getId() {
        return id;
    }

    public Car(int id, String name, String dis) {
        this.id = id;
        this.name = name;
        this.dis = dis;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDis() {
        return dis;
    }

    public void setDis(String dis) {
        this.dis = dis;
    }



}