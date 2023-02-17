package day06_ifElseStatements;

import java.util.Scanner;

public class C02_IfElseStatements {
    public static void main(String[] args) {

        /*
        Soru  - Kullanicidan yasını isteyin,
                65 yas ve uzeri ise "Emekli olabilirsin" yazdırın,
                degilse emekli olabilmesi icin gereken yıl sayisini yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (yas>=65) System.out.println("Emekli olabilirsin");
        else System.out.println("Emekli olabilmen icin " + (65-yas) + " yil daha calisman lazim");


    }
}