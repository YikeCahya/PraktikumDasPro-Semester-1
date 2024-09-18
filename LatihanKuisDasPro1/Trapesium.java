package LatihanKuisDasPro1;
import java.util.Scanner;
import java.lang.Math;

public class Trapesium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tinggi, panjangAB, panjangCD;

        System.out.println("Tingginya ");
        tinggi = sc.nextDouble();
        System.out.println("Panjang AB ");
        panjangAB = sc.nextDouble();
        System.out.println("Panjang CD ");
        panjangCD = sc.nextDouble();

        double Aa = (panjangAB-panjangCD)/2;
        double sisiMiring = Math.sqrt((Aa * Aa) + (tinggi * tinggi));

        double keliling = (2 * sisiMiring) + panjangAB + panjangCD;

        System.out.println("Keliling trapesium adalah " + keliling);


    }
}
