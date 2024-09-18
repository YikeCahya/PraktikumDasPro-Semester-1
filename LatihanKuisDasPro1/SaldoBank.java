package LatihanKuisDasPro1;
import java.util.Scanner;

public class SaldoBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldoAwal, persenBungaPerBulan = 0.02;
        int jumlahBulan;

        System.out.println("Masukkan saldo awal Rp ");
        saldoAwal = sc.nextDouble();
        System.out.println("Masukkan jumlah bulan ");
        jumlahBulan = sc.nextInt();

        double bungaDidapat = saldoAwal * persenBungaPerBulan;
        double saldoPlusBunga = saldoAwal + bungaDidapat;

        double saldoAkhir = saldoPlusBunga * jumlahBulan;

        System.out.println("Saldo akhirnya adalah Rp " + saldoAkhir);
    }
}
