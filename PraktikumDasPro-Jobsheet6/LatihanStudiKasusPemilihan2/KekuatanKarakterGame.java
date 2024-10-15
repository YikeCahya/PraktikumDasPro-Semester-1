package LatihanStudiKasusPemilihan2;
import java.util.Scanner;

public class KekuatanKarakterGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int serangan, pertahanan, kecepatan;
        String peringkat;

        System.out.print("Nilai serangan: ");
        serangan = sc.nextInt();
        System.out.print("Nilai pertahanan: ");
        pertahanan = sc.nextInt();
        System.out.print("Nilai kecepatan: ");
        kecepatan = sc.nextInt();

        if (serangan > 50 && pertahanan > 40 && kecepatan > 50) {
            peringkat = "Warrior";
        } else if (kecepatan > 80 && serangan > 50) {
            peringkat = "Assassin";
        } else if (pertahanan > 70 && kecepatan > 40) {
            peringkat = "Guardian";
        } else if (serangan > 70 && pertahanan > 50) {
            peringkat = "Tank";
        } else {
            peringkat = "Tidak ada peringkat";
        }

        System.out.println("Peringkat pemain adalah " + peringkat);

    }
}
