package com.kochalilibrahim;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Zaman t=new Zaman();
        Ürün ü=new Ürün();
        Ürün[] dizi=new Ürün[3];

        for(int i=0; i<3; i++) {

                System.out.println("Ürün adı giriniz: ");
                ü.setUrunAdi(scan.nextLine());

                System.out.println("ürün tipi giriniz: ");
                ü.setUruntipi(scan.nextLine());

                System.out.println("Skt ayını giriniz: ");
                t.setAy(scan.nextInt());

                System.out.println("Skt yılını giriniz: ");
                t.setYil(scan.nextInt());
                ü.setSkt(t);
                dizi[i]=ü;
        }

        sirala(dizi);



        for(int a=0; a<dizi.length; a++){
            System.out.println("Ürün adı     "+"Ürün tipi     "+"skt");
            System.out.println(dizi[a].getUrunAdi()+"     " +dizi[a].getUruntipi()+"      "+ dizi[a].getSkt().getAy()+"."+dizi[a].getSkt().getYil());
        }


        }

    public static Ürün[] sirala(Ürün[] dizi) {

        Ürün temp=null;
        for(int i=0; i<dizi.length; i++){

            for(int j=1; j<dizi.length-i; j++){
                int yil1=dizi[j].getSkt().getYil();
                int yil2=dizi[j-1].getSkt().getYil();

                if(yil2>yil1){
                    temp=dizi[j];
                    dizi[j]=dizi[j-1];
                    dizi[j-1]=temp;
                }
                else if(yil1==yil2){
                    int ay1=dizi[j].getSkt().getAy();
                    int ay2=dizi[j-1].getSkt().getAy();
                    if(ay2>ay1){
                        temp=dizi[j];
                        dizi[j]=dizi[j-1];
                        dizi[j-1]=temp;
                    }
                }

            }

        }

        return dizi;
    }


}

