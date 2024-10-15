package LatihanStudiKasusPemilihan2;

import java.util.Scanner;

public class KategoriUmurPengunjung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int umur;
        String kategori;

        System.out.print("Masukkan umur pengunjung:");
        umur = sc.nextInt();

        if (umur < 3) {
            kategori = "Gratis";
        } else if (umur > 3 && umur <= 12) {
            kategori = "Tiket Anak";
        } else if (umur > 13 && umur <= 59) {
            kategori = "Tiket Dewasa";
        } else {
            kategori = "Tiket Lansia";
        }

        System.out.println("Kategori tiket: " + kategori);
    }
}
