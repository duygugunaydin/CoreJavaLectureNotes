package test.day01;

public class Q1_Print {

    /*
    Konsolda :

    "Hello "\
    / 'World'"

    yazdiriniz.
     */
    /*
      \n (or \r)  : Starts from a new line : Metni bir alt satırdan itibaren yazdırır.
              \t  : Horizontal tab         : Metni yatayda 1 tab miktarı kaydırır.
              \\  : Prints a back slash    : \  Ters slash yazdırır
              \'  : Prints single quote    : '  Tek tırnak yazdırır.
              \"  : Prints double quote    : "  Çift tırnak yazdırır.
     */
    public static void main(String[] args) {




        String a ="\"Hello \"\\\n/ \'World\'\"" ;
        String b ="\"Hello \"\\\n/ 'World'\"";

        System.out.println(a.equals(b));

        System.out.println("\"Hello \"\\\n/ 'World'\"");

        String isim = "\"ahmet\"";
        System.out.println(isim);

        System.out.println("\"Hello \"\\\n/ 'Wo\trld'\"");


        ////////ODEV///////////////


        /*
        ************************************
                "ATM'ye Hosgeldiniz"
             1- Bakiye Sorgulama
             2- Para Yatirma
             3- Para Cekme
             4- Menu'den Cikis
        *************************************
         */

    }
}
