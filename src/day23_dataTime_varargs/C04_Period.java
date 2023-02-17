package day23_dataTime_varargs;

import java.time.LocalDate;
import java.time.Period;

public class C04_Period {
    public static void main(String[] args) {

        LocalDate dogumTarihi= LocalDate.of(1994,9,3);
        LocalDate bugun= LocalDate.now();

        Period yas = Period.between(dogumTarihi,bugun);

        System.out.println(yas); // P28Y3M18D
        System.out.println(yas.getYears()); // 28

        LocalDate baslangic=LocalDate.of(2012,9,15);
        LocalDate bitis= LocalDate.of(2016,6,20);

        Period sure= Period.between(baslangic,bitis);
        System.out.println(sure); // P3Y9M5D
    }
}
