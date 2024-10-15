import java.util.Scanner;

public class TempatParkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;


        do {
            System.out.print("Masukkan jenis kendaraan (1. Mobil, 2. Motor, 0. Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 0) {
                System.out.println("Keluar");

                break;
            }
    
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi kendaraan: ");
                durasi = sc.nextInt();

                //durasi
                if (durasi > 5) {
                    total = 12500;
                } else if (jenis == 1) {
                    total = durasi * 3000;
                } else if (jenis == 2) {
                    total = durasi * 2000;
                } else {
                    System.out.println("Jenis kendaraan tidak valid, Silahkan masukkan ulang.");
                    continue;
                }

                //System.out.println("Total pembayaran: " + total);

            } else {
                System.out.println("Masukkan ulang");
                continue;
            }

            System.out.println("Total pembayaran kendaraan ini: " + total);
        } while (true);

    }
}
