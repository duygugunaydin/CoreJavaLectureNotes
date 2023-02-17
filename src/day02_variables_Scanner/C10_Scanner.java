package day02_variables_Scanner;

import java.util.Scanner;

public class C10_Scanner {
    public static void main(String[] args) {

        /*
        Soru 2- Kullanicidan bir double, bir de int sayi alip,
                bunlarin toplamini ve carpimini yazdirin.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir ondalikli sayi giriniz");
        double sayi1 = scan.nextDouble();

        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi2 = scan.nextInt();

        System.out.println("Sayilarin toplami : " + (sayi1+sayi2) +
                         "\nSayilarin carpimi : " + sayi1*sayi2);
    }
}
