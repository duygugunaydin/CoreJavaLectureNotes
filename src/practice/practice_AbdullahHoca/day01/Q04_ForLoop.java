package YeniPracticeDersi.day01;

public class Q04_ForLoop {
    public static void main(String[] args) {

        /*
        Bir sayinin mükemmel olup olmadiğini bulan bir method yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)

        */

        int sayi = 28;
        mukemmelSayi(sayi);
        mukemmelSayi(6);

        int nmbr = 34;
    }

    public  static  void mukemmelSayi (int sayi){

        int toplam=0;

        for (int i = 1; i <sayi ; i++) {
            if (sayi%i==0){
                toplam+=i;
            }
        }
        if (sayi == toplam) System.out.println(sayi + "mukemmel");
        else System.out.println("mukemmel degil");
    }
}
