import java.util.Scanner;
public class SIAKADarray28 {
    public static void main(String[] args) {
        Scanner ike = new Scanner(System.in);

        //Input jumlah siswa dan jumlah matkul
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = ike.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = ike.nextInt();

        //Array of int
        int[][] nilai = new int[jumlahSiswa][jumlahMataKuliah];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = ike.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata mahasiswa ke-" +(i + 1) + ": " + totalPerSiswa / jumlahMataKuliah);
        }

        System.out.println("------------------------");

        for (int j = 0; j < jumlahMataKuliah; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < jumlahSiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Rata-rata mata kuliah " + (j + 1) + ": " + totalPerMatkul / jumlahSiswa);
        }
    }
}
