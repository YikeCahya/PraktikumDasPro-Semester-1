import java.util.Scanner;

public class TokoBuku28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String jenisBuku;
        int jumlahBuku;
        double diskon = 0;

        System.out.print("Masukkan jenis buku: ");
        jenisBuku = sc.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        jumlahBuku = sc.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 0.1;
            if (jumlahBuku > 2) {
                diskon = diskon + 0.02;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 0.07;
            if (jumlahBuku > 3) {
                diskon = diskon + 0.02;
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 0.05;
            } 
        }

        System.out.println("Total diskon yang didapatkan adalah " + diskon);

    }
}
