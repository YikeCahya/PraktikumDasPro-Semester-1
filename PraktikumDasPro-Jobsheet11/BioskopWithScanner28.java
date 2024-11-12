import java.util.Scanner;
public class BioskopWithScanner28 {
    public static void main(String[] args) {
        //Deklarasi Scanner
        Scanner ike = new Scanner(System.in);

        //Deklarasi 
        int baris, kolom;
        String nama, next;

        //Array penonton
        String[][] penonton = new String[4][2];

        //Perulangan
        while (true) {
            //Input menu
            System.out.println("\nMenu");
            System.out.println("Menu 1: Input data penonton ");
            System.out.println("Menu 2: Tampilkan daftar penonton");
            System.out.println("Menu 3: Exit");
            System.out.print("Pilih menu (1-3):");
            int menu = ike.nextInt();
            ike.nextLine();

            if (menu == 1) {
                // Input data penonton
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = ike.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = ike.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = ike.nextInt();
                    ike.nextLine(); 

                    // Validasi input baris dan kolom
                    if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                        System.out.println("Nomor baris atau kolom tidak valid. Silakan coba lagi.");
                    }
                    // Cek jika kursi sudah terisi
                    else if (penonton[baris-1][kolom-1] != null) {
                        System.out.println("Kursi sudah terisi. Silakan pilih kursi lain.");
                    } else {
                        penonton[baris-1][kolom-1] = nama;
                        System.out.println("Data penonton berhasil dimasukkan.");
                        break;  // Keluar dari loop jika data berhasil dimasukkan
                    }
                }
            } else if (menu == 2) {
                // Tampilkan daftar penonton
                System.out.println("\nDaftar Penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("*** ");
                        } else {
                            System.out.print(penonton[i][j] + " ");
                        }
                    }
                    System.out.println();
                }
            } else if (menu == 3) {
                // Exit
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
            }

            System.out.print("Input penonton lainnya? (y/n): ");
            next = ike.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
