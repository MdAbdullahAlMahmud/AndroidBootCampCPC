package com.example.bootcampandroid.model;

import java.io.Serializable;

public class FoodItem implements Serializable {

    private int image;
    private String name;
    private String desc;


    public FoodItem(int image, String name, String desc) {
        this.image = image;
        this.name = name;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
