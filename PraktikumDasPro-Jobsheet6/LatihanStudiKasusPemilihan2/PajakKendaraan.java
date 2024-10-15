package LatihanStudiKasusPemilihan2;

import java.util.Scanner;

public class PajakKendaraan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jenisKendaraan;
        int kapasitasMesin;
        double pajak = 0;

        System.out.print("Masukkan jenis kendaraan: ");
        jenisKendaraan = sc.nextLine();
        System.out.print("Masukkan kapasitas mesin: ");
        kapasitasMesin = sc.nextInt();

        if (jenisKendaraan.equalsIgnoreCase("motor")) {
            if (kapasitasMesin < 150) {
                pajak = 0.01;
            } else if (kapasitasMesin >= 150 && kapasitasMesin <= 250) {
                pajak = 0.02;
            } else {
                pajak = 0.05;
            }
        } else if (jenisKendaraan.equalsIgnoreCase("mobil")) {
            if (kapasitasMesin < 1000) {
                pajak = 0.03;
            } else if(kapasitasMesin >= 1000 && kapasitasMesin <= 2000) {
                pajak = 0.05;
            } else {
                pajak = 0.07;
            } 
        } else {
            System.out.println("Masukkan ulang jenis kendaraan");
        } 
        System.out.println(jenisKendaraan + " dengan kapasitas mesin sebesar: " + kapasitasMesin + " cc, memperoleh pajak kendaraan sebesar " + pajak + " dari harga kendaraan.");
    }
}
