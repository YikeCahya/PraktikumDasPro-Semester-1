import java.util.Scanner;

public class ArrayRataNilai28 {
    public static void main(String[] args) {
        Scanner ike = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;
        int jmlLulus = 0;
        int jmlTdkLulus = 0;
        double totalLulus = 0;
        double totalTdkLulus = 0;

        //Input nilai
        for(int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = ike.nextInt();
        }

        //Hitung total nilai
        for(int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];

            //Ngecek jika >70 lulus
            if (nilaiMhs[i] > 70) {
                jmlLulus++;
                totalLulus += nilaiMhs[i];
            } else {
                jmlTdkLulus++;
                totalTdkLulus += nilaiMhs[i];
            }
        }

        //Menghitung keseluruhan
        rata2 = total/nilaiMhs.length;

        //Menghitung rata2 lulus
        double rataLulus = (jmlLulus > 0) ? totalLulus / jmlLulus : 0;
        //Menghitung rata2 tidak lulus
        double rataTidakLulus = (jmlTdkLulus > 0) ? totalTdkLulus / jmlTdkLulus : 0;

        System.out.println("Rata-rata nilai = " + rata2);
        System.out.println("");
        System.out.println("Jumlah mahasiswa yang lulus: " + jmlLulus);
        System.out.println("Rata-rata nilai lulus: " + rataLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + jmlTdkLulus);
        System.out.println("Rata-rata nilai tidak lulus: " + rataTidakLulus);
    }
}
