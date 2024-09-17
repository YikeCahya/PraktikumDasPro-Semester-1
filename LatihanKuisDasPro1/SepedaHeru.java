package LatihanKuisDasPro1;
import java.util.Scanner;

public class SepedaHeru {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double jarakTempuh, kecepatan = 2;

        System.out.println("Masukkan jarak yang ditempuh ");
        jarakTempuh = sc.nextDouble();

        double waktuTempuh = jarakTempuh / kecepatan;

        System.out.println("Waktu yang ditempuk adalah " + waktuTempuh);
    }
}
