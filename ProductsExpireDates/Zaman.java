package com.kochalilibrahim;

public class Zaman {

    private int yil;
    private int ay;

    public Zaman() {
    }

    public Zaman(int yil, int ay) {
        this.yil = yil;
        this.ay = ay;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        if(yil>12 || yil<1){
            throw new IllegalArgumentException("Hatalı değer giridiniz!!");
        }
        else{
            this.yil = yil;
        }
    }

    public int getAy() {
        return ay;
    }

    public void setAy(int ay) {
        if(ay>12 || ay<1){
            throw new IllegalArgumentException("Hatalı değer girdiniz!!");
        }
        else{
            this.ay = ay;
        }
    }
}
