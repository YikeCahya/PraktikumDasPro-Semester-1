package LatihanKuisDasPro1;
import java.util.Scanner;

public class LayangLayang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double d1, d2;

        System.out.print("Masukkan panjang bambu ");
        d1 = sc.nextDouble();
        d2 = sc.nextDouble();

        double luasKertas = 0.5 * d1 * d2;

        double a = 0.5 * d1;

        System.out.println("Luas kerta yang diperlukan " + luasKertas);

        //jika input yang diperoleh hanya d1 dan d2 maka akan saya asumsikan perbandingan diagonal d2 adalah 1:4
        double b1 = 0.25 * d2;
        double b2 = 0.75 * d2;

        double ab1 = Math.sqrt((Math.pow(a, 2)) + (Math.pow(b1, 2)));
        double ab2 = Math.sqrt((a * a) + (b2 * b2));

        double panjangBenang = 2 * (ab1 + ab2);

        System.out.println("Panjang benangnya " + panjangBenang);

    }
}
