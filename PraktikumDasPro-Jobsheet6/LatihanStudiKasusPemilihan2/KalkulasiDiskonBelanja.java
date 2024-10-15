package LatihanStudiKasusPemilihan2;
import java.util.Scanner;

public class KalkulasiDiskonBelanja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalBelanja = 0, diskon = 0;

        System.out.print("Masukkan total belanja: ");
        totalBelanja = sc.nextDouble();

        if (totalBelanja >= 100000 && totalBelanja <= 500000) {
            diskon = 0.1;
        } else if (totalBelanja > 500000) {
            diskon = 0.2;
        }

        double totalBayar = totalBelanja * (1 - diskon);
        System.out.println("Total pembayaran: Rp " + totalBayar);
    }
}
