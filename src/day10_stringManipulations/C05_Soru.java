package day10_stringManipulations;

import java.util.Scanner;

public class C05_Soru {
    public static void main(String[] args) {

        /*
        Soru 1 - Kullanicidan bir cumle alin;
                 - Cumlede ev geciyorsa "Home home sweet home" yazdirin,
                 - Cumlede is geciyorsa "Calismak guzeldir" yazdirin,
                 - ikisini de iceriyorsa "Hem ev lazim hem is" ,
                 - Hicbirini icermiyorsa "Cok calisman lazim" yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String girilenCumle = scan.nextLine();

        String bakilacakcumle = girilenCumle.toLowerCase();

        if (bakilacakcumle.contains("ev") && bakilacakcumle.contains("is")) {
            System.out.println("Hem ev lazim hem is");
        } else if (bakilacakcumle.contains("is")) {
            System.out.println("Calismak guzeldir");
        } else if (bakilacakcumle.contains("ev")) {
            System.out.println("Home home sweet home");
        } else {
            System.out.println("Cok calisman lazim");
        }

    }
}
