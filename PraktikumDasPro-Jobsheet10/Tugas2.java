import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner ike = new Scanner(System.in);
        Scanner ike2 = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int n = ike.nextInt();

        System.out.println("----------------------------------");

        String[] nama = new String[n];
        double[] harga = new double[n];

        int i = 0;
        double totalBiaya = 0;

        do {
            
            System.out.print("Nama pesanan ke-" + (i + 1) + ":");
            nama[i] = ike2.nextLine();
            System.out.print("Harga pesanan ke-" + (i + 1) + ": ");
            harga[i] = ike.nextInt();
            totalBiaya = totalBiaya + harga[i];
            i++;
        } while (i<n);

        System.out.println("Total biaya: " + totalBiaya);
    }
}
