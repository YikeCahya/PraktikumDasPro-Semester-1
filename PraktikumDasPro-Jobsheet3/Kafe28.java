import java.util.Scanner;

public class Kafe28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.00, hargaTeh = 7000.0, hargaRoti = 20000.0, totalHarga, nominalBayar;
        float diskon = 10 / 100;

        System.out.print("Masukkan keanggotaan (true/false):");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi:");
        jmlKopi = input.nextInt();
        System.out.print("Masukkan jumlah pembelian teh:");
        jmlTeh = input.nextInt();
        System.out.print("Masukkan jumlah pembelian roti:");
        jmlRoti = input.nextInt();

        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        byte nilaiByte = (byte) totalHarga;
        System.out.println("Nilai byte setelah casting: " + nilaiByte);

        nominalBayar = totalHarga - (diskon * totalHarga);
        int nominalInt = (int) nominalBayar;
        System.out.println("Nominal setelah casting: " + nominalInt);

        System.out.println("Keanggotaan pelanggan: " + keanggotaan);
        System.out.println("Item pembelian: " + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti" );
        System.out.println("Nominal bayar Rp " + nominalBayar);
    }
}
