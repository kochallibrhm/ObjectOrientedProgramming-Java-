package com.kochalilibrahim;

public class Asker extends Dünyali {

    private int silahGucu;

    @Override
    public int gucHesapla() {
        System.out.println("Silah Gücü:" +silahGucu);
        return silahGucu*getSavunmaGucu();
    }

    public int getSilahGucu() {
        return silahGucu;
    }

    public void setSilahGucu(int silahGucu) {
        this.silahGucu = silahGucu;
    }

    public Asker() {
    }

    public Asker(int silahGucu) {
        this.silahGucu = silahGucu;

    }
}
