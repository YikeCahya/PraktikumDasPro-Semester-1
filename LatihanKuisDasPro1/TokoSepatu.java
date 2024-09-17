package LatihanKuisDasPro1;
import java.util.Scanner;

public class TokoSepatu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTotalBarangTerjual, jumlahHari;

        System.out.print("Masukkan jumlah total barang yang terjual ");
        jumlahTotalBarangTerjual = sc.nextInt();

        System.out.print("Masukkan jumlah hari ");
        jumlahHari = sc.nextInt();

        double meanBarangTerjual = jumlahTotalBarangTerjual / jumlahHari;

        System.out.println("Rata-rata barang yang terjual adalah " + meanBarangTerjual);

    }
}
