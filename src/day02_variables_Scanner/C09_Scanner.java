package day02_variables_Scanner;

import java.util.Scanner;

public class C09_Scanner {

    public static void main(String[] args) {

        /*
    Soru 7 (Interview)- Kullanicidan iki sayi alip,
                        ikisinin degerlerini degistirin(swap).

                        kullanicinin girdigi degerler ;
                        sayi1 = 10 ve sayi2 = 20 ise,

                        siz kod ile bunlarin yerlerini degistirip
                        sayi1 = 20 ve sayi2 = 10 yapin
       */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sayi1'i giriniz :");
        int sayi1 = scan.nextInt();
        System.out.println("Lutfen sayi2'yi giriniz :");
        int sayi2 = scan.nextInt();

        // bos bir variable olusturalim :
        int temp ;


        // 1.adim >> sayi2 degerini > temp'e atayalim :

        temp = sayi2 ;


        // 2.adim >> sayi1 degerini > sayi2'ye atayalim :

        sayi2 = sayi1 ;


        // 3.adim >> temp'deki degeri > sayi1'e atayalim.

        sayi1 = temp ;


        System.out.println("Sayilarin degismis hali : " +
                         "\nsayi1'in yeni degeri : " + sayi1 +
                         "\nsayi2'nin yeni degeri : " + sayi2 );
    }
}
