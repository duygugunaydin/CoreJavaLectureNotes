package day24_StringBuldier_Encapsulation;

public class C03_StringBuldier {

    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder("Java");

        StringBuilder sb2= new StringBuilder("Java");

        String str="Java";


        System.out.println(sb1==sb2); // false
        System.out.println(sb1.equals(sb2)); // false
        // StringBuilder metin esitligini sorgulamamk icin equals() kullanmaz
        // compareTo kullanilir; o da ilk farklilik buldugu yeri karsılastırır
        System.out.println(sb1.compareTo(sb2)); // 0

        StringBuilder sb3= new StringBuilder("Hava");

        System.out.println(sb1.compareTo(sb3)); // 2 >> Java>Hava >> h'den iki sonra j oldugu icin> 2

        sb3= new StringBuilder("Tava");

        System.out.println(sb1.compareTo(sb3)); // -10 >> Java>Tava >> t'den 10 once j oldugu icin >-10

        sb3= new StringBuilder("Jaka");

        System.out.println(sb1.compareTo(sb3)); // 11

        sb3= new StringBuilder("Javax");

        System.out.println(sb1.compareTo(sb3)); // -1

        sb3= new StringBuilder("Java Candir");

        System.out.println(sb1.compareTo(sb3)); // -7

        //********** yani sonuc olarak 0 ise ayni degilse farklidir ************* //


        // System.out.println(sb1==str); // data turleri farkli CTE verir

        System.out.println(sb1.equals(str)); // false

        // System.out.println(sb1.compareTo(str));
        // compareTo SB'lar arasinda calisir, farkli data turu kabul etmez.


    }
}
