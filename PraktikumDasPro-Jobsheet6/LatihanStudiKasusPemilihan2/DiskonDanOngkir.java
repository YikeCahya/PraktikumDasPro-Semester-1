package LatihanStudiKasusPemilihan2;

import java.util.Scanner;

public class DiskonDanOngkir {
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);

        int pembayaran;
        double totalBelanja, diskon = 0, ongkir = 0;

        System.out.print("Masukkan metode pembayaran (1. Kartu Kredit, 2. Transfer Bank, 3. COD (Cash on Delivery))");
        pembayaran = sc.nextInt();
        System.out.print("Masukkan total belanja: Rp ");
        totalBelanja = sc.nextDouble();

        if (totalBelanja > 500000) {
            if (pembayaran == 1) {
                diskon = 0.1;
            } else if (pembayaran == 2) {
                diskon = 0.05;
                ongkir = 20000;
            } else if (pembayaran == 3){
                ongkir = 30000;
            }
        } else {
            ongkir = 50000;
        }

        double totalPembayaran = totalBelanja * (1 - diskon) + ongkir;

        System.out.println("Total yang harus dibayarkan adalah Rp " + totalPembayaran);
    }
}
