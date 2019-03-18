package com.kochalilibrahim;

public class Cyborg extends Uzaylı {

    private int lazerGucu;

    @Override
    public int gucHesapla() {
        System.out.println("LazerGücü: "+ lazerGucu);
        return lazerGucu*getSavunmaGucu();
    }

    public int getLazerGucu() {
        return lazerGucu;
    }

    public void setLazerGucu(int lazerGucu) {
        this.lazerGucu = lazerGucu;
    }

    public Cyborg() {
    }

    public Cyborg(int lazerGucu) {
        this.lazerGucu = lazerGucu;
    }


}
