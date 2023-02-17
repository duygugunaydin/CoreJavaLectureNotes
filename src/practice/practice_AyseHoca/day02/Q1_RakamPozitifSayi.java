package test.day02;

import java.util.Scanner;

public class Q1_RakamPozitifSayi {
    public static void main(String[] args) {

        /*
        Soru - Kullanicidan bir sayi aliniz,
               Sayi sifirdan buyuk ise, 10'dan kucuk olup olmadigini kontrol ediniz.
               10'dan kucuk ise ekrana "Rakam" yazdiriniz, degilse "Pozitif Sayi" yazdiriniz.
               Sayi sifirdan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi>=0){
            if (sayi<10) {
                System.out.println("Rakam");
            }else {
                System.out.println("Pozitif Sayi");
            }
        }else {
            System.out.println("Negatif Sayi");
        }

        System.out.println("************ TERNARY İLE COZUMU ***************");

        System.out.println(sayi>=0 ? sayi<10 ? "Rakam" : "Pozitif Sayi" : "Negatif Sayi");
    }
}
