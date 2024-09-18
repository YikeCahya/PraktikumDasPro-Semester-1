package LatihanKuisDasPro1;
import java.util.Scanner;

public class Toko {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahBarang;
        double hargaSatuan, jumlahUang;

        System.out.print("Masukkan jumlah barang yang dibeli   :");
        jumlahBarang = sc.nextInt();
        System.out.print("Masukkan harga satuan barang         : ");
        hargaSatuan = sc.nextDouble();

        double totalBelanjaan = jumlahBarang * hargaSatuan;

        System.out.println("--------------------------------------------");
        System.out.println("jumlah total belanja         Rp " + totalBelanjaan);

        System.out.print("Masukkan jumlah uang         Rp ");
        jumlahUang = sc.nextDouble();

        double kembalian = jumlahUang - totalBelanjaan;

        System.out.println("--------------------------------------------");
        System.out.println("Nominal kembalian            Rp " + kembalian);
    }
}
