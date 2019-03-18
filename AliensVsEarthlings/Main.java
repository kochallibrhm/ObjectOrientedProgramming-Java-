package com.kochalilibrahim;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        Dünyali[] diziDunyali=randomDunyali();
        Uzaylı[] diziUzayli=randomUzayli();


        int DunyaliGucu=0;
        int UzayliGUcu=0;
        int KlavyeDegeri=0;

        while(KlavyeDegeri != -1){
            for(int i=0; i<3; i++) {
                System.out.println("\nROUND"+(i+1));

                System.out.println("dSavunmagucu: "+diziDunyali[i].getSavunmaGucu()+"\tDünyalıgücü:"+diziDunyali[i].gucHesapla());
                System.out.println("USavunmagucu: "+diziUzayli[i].getSavunmaGucu()+"\tUzaylıgücü:"+diziUzayli[i].gucHesapla());
                DunyaliGucu += diziDunyali[i].gucHesapla();
                UzayliGUcu += diziUzayli[i].gucHesapla();
            }
            System.out.println("\n");
            int sonuc = DunyaliGucu - UzayliGUcu;
            System.out.println("Dünyalı Gücü: "+DunyaliGucu);
            System.out.println("Uzaylı Gücü: "+UzayliGUcu);
            System.out.println("Oyun Puanı: "+sonuc);
            if(sonuc<0){
                System.out.println("Uzaylilar Kazandi...");
            }
            else{
                System.out.println("Dunyalilar Kazandi...");
            }

            System.out.println("Devam etmek istemiyorsanız -1 giriniz");
            KlavyeDegeri=scan.nextInt();

        }


    } public static Dünyali[] randomDunyali() {
        Random random = new Random();
        Dünyali[] diziDunyali = new Dünyali[10];
        Dünyali dunyali;

        for (int i = 0; i < 3; i++) {
            int randomChoise = random.nextInt(10);
            if (randomChoise == 1) {
                dunyali = new Asker(random.nextInt(10));
                dunyali.setSavunmaGucu(random.nextInt(10));
            }
            else {
                dunyali = new Ciftci(random.nextInt(10));
                dunyali.setSavunmaGucu(random.nextInt(10));
            }
            diziDunyali[i]=dunyali;
        }
        return diziDunyali;
    }

    public static Uzaylı[] randomUzayli(){
        Random random=new Random();
        Uzaylı[] diziUzayli=new Uzaylı[10];
        Uzaylı uzayli;
        for(int i=0; i<3; i++){
            int randomChoise = random.nextInt(10);
            if (randomChoise == 1){
                uzayli=new Cyborg(random.nextInt(10));
                uzayli.setSavunmaGucu(random.nextInt(10));
            }
            else {
                uzayli=new Madenci(random.nextInt(10));
                uzayli.setSavunmaGucu(random.nextInt(10));
            }
            diziUzayli[i]=uzayli;
        }
        return diziUzayli;
    }
}
