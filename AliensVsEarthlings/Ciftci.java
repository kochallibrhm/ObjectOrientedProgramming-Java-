package com.kochalilibrahim;

public class Ciftci extends Dünyali {

    private int urunSayisi;


    @Override
    public int gucHesapla() {
        return urunSayisi;
    }

    public int getUrunSayisi() {
        return urunSayisi;
    }

    public void setUrunSayisi(int urunSayisi) {
        this.urunSayisi = urunSayisi;
    }

    public Ciftci() {
    }

    public Ciftci(int urunSayisi) {
        this.urunSayisi = urunSayisi;
    }
}
