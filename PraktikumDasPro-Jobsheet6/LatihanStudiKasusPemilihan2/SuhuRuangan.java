package LatihanStudiKasusPemilihan2;
import java.util.Scanner;

public class SuhuRuangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double suhu;
        String kategori;

        System.out.print("Masukkan suhu: ");
        suhu = sc.nextDouble();

        if (suhu < 18) {
            System.out.println("Ruangan terlalu dingin.");
        } else if (suhu >= 18 && suhu <= 26) {
            System.out.println("Suhu ruangan normal.");
        } else {
            System.out.println("Ruangan terlalu panas.");
        }

    }
}
