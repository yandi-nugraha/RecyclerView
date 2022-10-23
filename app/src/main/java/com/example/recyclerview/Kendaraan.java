package com.example.recyclerview;

public class Kendaraan {
    String name;
    String type;
    String desc;
    int img;

    public Kendaraan(String name, String type, String desc, int img) {
        this.name = name;
        this.type = type;
        this.desc = desc;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }

    public int getImg() {
        return img;
    }
}
