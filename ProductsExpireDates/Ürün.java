package com.kochalilibrahim;

public class Ürün {

        private String urunAdi;
        private String uruntipi;
        private Zaman skt;

    public Ürün() {
    }

    public Ürün(String urunAdi, String uruntipi, Zaman skt) {
        this.urunAdi = urunAdi;
        this.uruntipi = uruntipi;
        this.skt = skt;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public String getUruntipi() {
        return uruntipi;
    }

    public void setUruntipi(String uruntipi) {
        this.uruntipi = uruntipi;
    }

    public Zaman getSkt() {
        return skt;
    }

    public void setSkt(Zaman skt) {
        this.skt = skt;
    }
}
