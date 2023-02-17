package test.day02;

import java.util.Scanner;

public class Q2_SwitchCase_HesapMakinesi {
    public static void main(String[] args) {

        /*
         * Kullanicidan iki tamsayi sayi ve islem cinsini alin
         * ve sayilari kullanicinin belirledigi isleme tabii tutup sonucu yazdirin.
         *
         * islem cinsi icin 1:toplama 2:cikarma 3:carpma 4: bolme
         *
         * Ornek : Inputs : sayilar : 18 , 10  islem : 3
         *         Output : 18 X 10 = 180
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Matematiksel isleme sokmak icin iki adet tam sayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        System.out.println("Lutfen yapmak istediginiz islem turunu seciniz : " +
                "\n1 : Toplama \n2 : Cikarma \n3 : Carpma \n4 : Bolme");
        int islem = scan.nextInt();

        System.out.println("*********** if ile Cozumu **********");

        if (islem==1) System.out.println("Girdiginiz islem toplama : " + (sayi1+sayi2));
        else if (islem==2) System.out.println("Girdiginiz islem cikarma : " + (sayi1-sayi2) );
        else if (islem==3) System.out.println("Girdiginiz islem carpma : " + (sayi1*sayi2) );
        else if (islem==4){
             if (sayi2 == 0 ) System.out.println("0'a bolum tanimizdir");
             else System.out.println("Girdiginiz islem bolme : " + (sayi1/sayi2) );}
        else System.out.println("Yanlis islem yaptiniz, Lutfen tekrar deneyiniz");


        System.out.println("*********** Switch Case ile Cozumu **********");

        switch (islem){
            case 1 :
                System.out.println("Girdiginiz islem toplama : " + (sayi1+sayi2) );
                break;
            case 2 :
                System.out.println("Girdiginiz islem cikarma : " + (sayi1-sayi2) );
                break;
            case 3 :
                System.out.println("Girdiginiz islem carpma : " + (sayi1*sayi2) );
                break;
            case 4 :
                if (sayi2 == 0 ) System.out.println("0'a bolum tanimizdir");
                else System.out.println("Girdiginiz islem bolme : " + (sayi1/sayi2) );
                break;
            default:
                System.out.println("Yanlis islem yaptiniz, Lutfen tekrar deneyiniz");
        }

        System.out.println("*********** Switch Case ile Cozumu **********");

        char isaret = scan.next().charAt(0);

        switch (isaret){
            case '+' :
                System.out.println("Girdiginiz islem toplama : " + (sayi1+sayi2) );
                break;
            case '-' :
                System.out.println("Girdiginiz islem cikarma : " + (sayi1-sayi2) );
                break;
            case'*' :
                System.out.println("Girdiginiz islem carpma : " + (sayi1*sayi2) );
                break;
            case '/' :
                if (sayi2 == 0 ) System.out.println("0'a bolum tanimizdir");
                else System.out.println("Girdiginiz islem bolme : " + (sayi1/sayi2) );
                break;
            default:
                System.out.println("Yanlis islem yaptiniz, Lutfen tekrar deneyiniz");

        }



    }
}
