package com.example.recyclerview;

public class item {

    String name;
    String nim;
    int gambar;

    public item(String name, String nim, int gambar) {
        this.name = name;
        this.nim = nim;
        this.gambar = gambar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return nim;
    }

    public void setEmail(String nim) {
        this.nim = nim;
    }

    public int getImage() {
        return gambar;
    }

    public void setImage(int image) {
        this.gambar = gambar;
    }
}