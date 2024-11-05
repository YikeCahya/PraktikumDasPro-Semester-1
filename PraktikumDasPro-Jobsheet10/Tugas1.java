import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner ike = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa = ");
        int jmlMhs = ike.nextInt();

        int[] nilaiMhs = new int[jmlMhs];

        for(int i = 0; i < jmlMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = ike.nextInt();
        }


        
        //Menghitung rerata
        int jmlNilai = 0;
        for(int i = 0; i < jmlMhs; i++) {
            
            jmlNilai += nilaiMhs[i];
        }
        double rata2 = jmlNilai/jmlMhs;

        int nilaiTertinggi = nilaiMhs[0];
        int nilaiTerendah = nilaiMhs[0];

        //Tertinggi terendah
        for(int i = 1; i < jmlMhs; i++) {
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            }

            if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }

        System.out.println("\nHasil:");
        System.out.print("Nilai yang dimasukkan: ");
        for (int nilai : nilaiMhs) {
            System.out.print(nilai + " ");
        }
        
        System.out.println(" ");
        System.out.println("Rata-rata: " + rata2);
        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);
    }
}
