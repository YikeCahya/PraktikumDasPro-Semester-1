package LatihanKuisDasPro1;
import java.util.Scanner;
import java.lang.Math;

public class TandonAir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double jarijari, tinggi, kecepatan;

        System.out.println("Jari-jarinya adalah ");
        jarijari = sc.nextDouble();
        System.out.println("Tingginya adalah ");
        tinggi = sc.nextDouble();
        System.out.println("Kecepatan pengisian airnya adalah ");
        kecepatan = sc.nextDouble();

        double volume = Math.PI * Math.pow(jarijari, 2) * tinggi;
        double waktu = volume / kecepatan;

        System.out.println("Waktu yang dibutuhkan adalah " + waktu);
    }
}
