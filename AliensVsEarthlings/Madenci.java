package com.kochalilibrahim;

public class Madenci extends Uzaylı {
    private int madenSayisi;


    @Override
    public int gucHesapla() {
        return madenSayisi;
    }

    public int getMadenSayisi() {
        return madenSayisi;
    }

    public void setMadenSayisi(int madenSayisi) {
        this.madenSayisi = madenSayisi;
    }

    public Madenci() {
    }

    public Madenci(int madenSayisi) {
        this.madenSayisi = madenSayisi;
    }
}
