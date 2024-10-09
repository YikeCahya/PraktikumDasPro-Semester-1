import java.util.Scanner;

public class TempatParkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;


        do {
            System.out.print("Masukkan jenis kendaraan (1. Mobil, 2. Motor, 0. Keluar): ");
            jenis = sc.nextInt();
    
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi kendaraan: ");
                durasi = sc.nextInt();

                //durasi
                if (durasi > 5) {
                    total += 12500;
                } else if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }

                System.out.println("Total pembayaran: " + total);

            } else {
                System.out.println("Salah");
                continue;
            }

            //total semua pembayaran kendaraan
            double totalSemuaKendaraan = 
        } while (true);
    }
}
