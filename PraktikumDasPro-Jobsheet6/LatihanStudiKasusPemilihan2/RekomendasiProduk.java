package LatihanStudiKasusPemilihan2;
import java.util.Scanner;

public class RekomendasiProduk {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    String kategori, rekomendasi = "Tidak ada rekomendasi";
    double rentangHarga;

    System.out.print("Kategori yang dipilih: ");
    kategori = sc.nextLine();
    System.out.print("Rentang harga yang dipilih: ");
    rentangHarga = sc.nextDouble();

        if (kategori.equalsIgnoreCase("Elektronik")) {
            if (rentangHarga > 5000000) {
                rekomendasi = "Laptop, Smartphone";
            } else {
                rekomendasi = "Headphone, Mouse, Keyboard";
            }
        } else if (kategori.equalsIgnoreCase("Fashion")) {
            if (rentangHarga > 500000) {
                rekomendasi = "Jaket Kulit, Sepatu, Branded";
            } else {
                rekomendasi = "Kaos, Celana Jeans";
            }
        } else if (kategori.equalsIgnoreCase("Makanan")) {
            if (rentangHarga > 200000) {
                rekomendasi = "Paket Katering Premium";
            } else {
                rekomendasi = "Makanan Cepat Saji";
            }
        } else {
            System.out.println("Masukan kategori salah");
        }

        System.out.println("Rekomendasi " + rekomendasi);
    }
}
