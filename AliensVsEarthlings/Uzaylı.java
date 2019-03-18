package com.kochalilibrahim;

public class Uzaylı implements Savunma{
    private int savunmaGucu;



    public int getSavunmaGucu() {
        return savunmaGucu;
    }

    public void setSavunmaGucu(int savunmaGucu) {
        this.savunmaGucu = savunmaGucu;
    }

    @Override
    public int gucHesapla() {
        return 0;
    }
}
