import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {

        // Daftar menu makanan yang tersedia di kafe
         String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar", 
            "Kentang Goreng", "Teh Tarik", "Cappuccino", "Chocolate Ice"
        };

        //Scanner
        Scanner ike = new Scanner(System.in);
        Scanner ike2 = new Scanner(System.in);

        //Tampilin menu
        System.out.println("Menu Makanan di Kafe:");
        for (String item : menu) {
            System.out.println("- " + item);
        }

        System.out.print("Masukkan jumlah pesanan: ");
        int n = ike.nextInt();

        //Nyimpen nama & harga
        String[] nama = new String[n];
        double[] harga = new double[n];

        int i = 0;
        double totalBiaya = 0;

        do {
            
            System.out.println("----------------------------------");

            //Input nama
            System.out.print("Nama pesanan ke-" + (i + 1) + ":");
            nama[i] = ike2.nextLine();

            //Ada tidak?
            boolean ditemukan = false;
            for (String item : menu) {
                if (item.equalsIgnoreCase(nama[i])) {
                    ditemukan = true;
                    break;
                }
            }

            if (ditemukan) {
                // Meminta harga pesanan jika makanan tersedia
                System.out.print("Harga pesanan ke-" + (i + 1) + ": ");
                harga[i] = ike.nextDouble();
                totalBiaya += harga[i];
            } else {
                System.out.println("Maaf, makanan \"" + nama[i] + "\" tidak ada di menu.");
                i--;  // Mengurangi indeks jika makanan tidak ditemukan
            }

            i++;
        } while (i<n);

        System.out.println("-----------------------------");
        System.out.println("Total biaya: " + totalBiaya);
    }
}
