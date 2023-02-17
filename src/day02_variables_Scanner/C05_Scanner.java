package day02_variables_Scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        // Kullanicidan ismini alin
        // ve girilen ismi buyuk harflerle yazdirin.

        // Kullanicidan deger almak icin 3 islem yapmamimiz gerekir:

        // 1.adim >> scanner objesi olusturmak,

        Scanner scan = new Scanner(System.in);


        // 2.adim >> kullaniciya ne istediginizi soyleyin:

        System.out.println("Lutfen isminizi yaziniz");


        /* 3.adim >> Kullanicinin girecegi degeri kaydedeceginiz bir variable olusturun
                     scan objesi ile ilgili method'u kullanarak kullanicinin girdigi degeri
                     olusturdugumuz variable'a atayin */

        String girilenIsim = scan.nextLine();


        // Artik kullanicinin girdigi deger girilenIsim variable'inda kayittli

        System.out.println(girilenIsim.toUpperCase());
    }
}
