import java.util.Scanner;

public class TiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double harga = 50000, totalHarga1Transaksi, totalHarga = 0;
        int totalTiket = 0, jmlTiket1Transaksi = 0;

        do {
            System.out.println("-----------------------------");
            System.out.print("Masukkan jumlah tiket: ");
            jmlTiket1Transaksi = sc.nextInt();

            if (jmlTiket1Transaksi < 0 ) {
                System.out.println("Input tidak valid, masukkan dengan benar!");
                continue;
            }

            System.out.println("------------------------");

            //memeriksa besaran diskon
            if (jmlTiket1Transaksi > 4) {
                totalHarga1Transaksi = jmlTiket1Transaksi * harga * 0.9;
                
            } else if (jmlTiket1Transaksi > 10) {
                totalHarga1Transaksi =  jmlTiket1Transaksi * harga * 0.85;
            } else {
                totalHarga1Transaksi = jmlTiket1Transaksi * harga;
            }
            totalTiket = jmlTiket1Transaksi + totalTiket;
            System.out.println("total keseluruhan tiket " + totalTiket);
            
            totalHarga = totalHarga1Transaksi + totalHarga;
            System.out.println("Total pendapatan satu hari: " + totalHarga);
            System.out.println("-----------------------------");

        } while (true);
    }
}
