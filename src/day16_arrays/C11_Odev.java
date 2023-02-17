package day16_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C11_Odev {

    public static void main(String[] args) {

        // Kullanicidan yeni isimler alip var olan bir array'e ekleyen bir method olusturun
        // Kullanici yeni deger verdigi muddetce C10'daki hazir method'u kullanarak eklemeye devam edin
        // Kullanici Q'ya bastiginda, array'in son halini döndürün

        String [] olusturulanArray =yeniArrayOlusturmaMethodu() ;

        System.out.println(Arrays.toString(olusturulanArray));

    }

    public static String [] yeniArrayOlusturmaMethodu (){

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen arraye eklenecek isim giriniz");
        String eklenecekIsim = scan.nextLine();
        String [] yeniOlusanArray = {eklenecekIsim};

        while (!(eklenecekIsim.equalsIgnoreCase("q"))){

            System.out.println("Lutfen arraye eklenecek yeni ismi giriniz" +
                    "\nBitirmek isterseniz q'ya basiniz.");
            eklenecekIsim=scan.nextLine();
            if (eklenecekIsim.equalsIgnoreCase("q")) {
                break;
            }    else{
                yeniOlusanArray = arreyeElemanEkleme(yeniOlusanArray, eklenecekIsim);
            }
        }
        return yeniOlusanArray;

    }
    public static String [] arreyeElemanEkleme (String[] arr , String eklenecekEleman){

        String[] yeniArr = new String[arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            yeniArr[i]=arr[i];
        }
        yeniArr[yeniArr.length-1]=eklenecekEleman;

        return yeniArr;

    }

}
