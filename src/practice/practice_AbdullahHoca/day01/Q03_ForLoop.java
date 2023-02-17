package YeniPracticeDersi.day01;

import java.util.Scanner;

public class Q03_ForLoop {
    public static void main(String[] args) {

            /*
             * Girilen bir stringdeki a harfi sayısını bulunuz. ama c harfine gelirse
             * döngüden çıkılsın
             *
             * Bugün hava oldukca güzel.-> 2
             *
             *
             */

            String str ="Bugün hava oldukca güzel";
            int flag =0;

            for (int i = 0; i <str.length() ; i++) {
                if (str.charAt(i)=='a') {
                    flag++;
                } else if ((str.charAt(i) == 'c'))
                    break;

            }
            System.out.println("yazilan cumlede " + (flag) + " kadar a harfi var");


            System.out.println("=================");

            /*
             * Girilen bir stringdeki a harfi sayısını bulunuz. ama c harfine gelirse döngüden çıkılsın
             *
             * Bugün hava oldukca güzel.-> 2
             *
             *
             */


            System.out.println("Bir cümle giriniz= ");
            Scanner scan = new Scanner(System.in);
            String cumle = scan.nextLine().toUpperCase();
            int sayac = 0;
            for (int i = 0; i < cumle.length(); i++) {
                if (cumle.charAt(i) == 'A') {
                    sayac++;
                }
                if (cumle.charAt(i) == 'C') {
                    break;
                }


            }
            System.out.println(cumle + "-->" + sayac);
    }
}
