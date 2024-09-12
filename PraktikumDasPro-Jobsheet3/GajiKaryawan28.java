import java.util.Scanner;
public class GajiKaryawan28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahJam, upahPerjam;
        double persenBonus = 0.1, persenPajak = 0.05;

        System.out.print("Masukkan jumlah jam: ");
        jumlahJam = input.nextInt();
        System.out.print("Masukkan upah perjam: ");
        upahPerjam = input.nextInt();

        int totalGaji = jumlahJam * upahPerjam;
        double bonus = persenBonus * totalGaji;
        int totalGajiPlusBonus = totalGaji + (int)bonus;
        double pajak = persenPajak * totalGajiPlusBonus;
        int gajiBersih = totalGajiPlusBonus - (int)pajak;

        System.out.println("Total gaji: " + totalGaji);
        System.out.println("Bonus: " + bonus);
        System.out.println("Pajak: " + pajak);
        System.out.println("Gaji bersih: " + gajiBersih);
    }
}
