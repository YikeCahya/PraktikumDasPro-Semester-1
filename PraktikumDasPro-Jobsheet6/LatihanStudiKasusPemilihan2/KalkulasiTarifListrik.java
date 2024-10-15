package LatihanStudiKasusPemilihan2;
import java.util.Scanner;

public class KalkulasiTarifListrik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlListrik;

        System.out.print("Masukkan jumlah penggunaan daya (kWh): ");
        jmlListrik = sc.nextInt();

        if (jmlListrik < 100) {
            jmlListrik *= 1000;
        } else if (jmlListrik >= 100 && jmlListrik <= 500) {
            jmlListrik *= 1200;
        } else {

            if (jmlListrik > 1000) {
                jmlListrik *= 1500;
                jmlListrik += 100000;
            } else {
                jmlListrik *= 1500;
            }
        }

        System.out.println("Tarif listrik rumah tangga sebesar: Rp " + jmlListrik);
    }
}
