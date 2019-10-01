package com.memeapp.Model;

public class Picture {
    private String name;
    private int categoryId;


    public Picture(String name, int categoryId) {
        this.name = name;
        this.categoryId = categoryId;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}

