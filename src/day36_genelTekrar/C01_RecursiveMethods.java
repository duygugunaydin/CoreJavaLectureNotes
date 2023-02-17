package day36_genelTekrar;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class C01_RecursiveMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir tam sayi");
        int sayi = scan.nextInt();

        toplaForLoop(sayi);
    }

    private static void toplaForLoop(int sayi) {

        int toplam = 0 ;
        for (int i = 0; i <=sayi ; i++) {
            toplam += i ;
        }
    }
}
