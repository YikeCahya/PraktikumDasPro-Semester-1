package LatihanStudiKasusPemilihan2;
import java.util.Scanner;
public class KelayakanKreditBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pendapatan, cicilan;
        boolean riwayatKredit;
        int pekerjaan;
        String penilaian = "Kredit ditolak";

        System.out.print("Input pendapatan: Rp ");
        pendapatan = sc.nextDouble();

        if (pendapatan >= 5000000) {

            System.out.print("Apakah pernah ada tunggakan atau keterlambatan?(True/False)");
            riwayatKredit = sc.nextBoolean();

            if (riwayatKredit == false ) {

                System.out.print("Jenis pekerjaan (1.Pekerjaan tetap, 2.Kontrak jangka panjang, 3.Freelance)");
                pekerjaan = sc.nextInt();

                if (pekerjaan == 1 || pekerjaan == 2) { //kondisi True tidak berfungsi
                    penilaian = "Kredit disetujui";
                } else {

                    System.out.print("Besar cicilan perbulan: Rp ");
                    cicilan = sc.nextDouble();

                    double persenCicilan = cicilan / pendapatan;

                    if (persenCicilan <= 0.3) {
                        penilaian = "Kredit disetujui";
                    } 

                }
            }               
        } 
            System.out.println(penilaian);
    }
}
