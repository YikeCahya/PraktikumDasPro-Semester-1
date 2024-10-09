import java.util.Scanner;

public class SiakadFor28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100; 
        //tertinggi diisi 0 karena biar ada perbandingannya, kalo diisi 100 maka outputnya ya 100. karena itu nilai maks nya.
        //terendah diisi 100 karena biar ada perbandingannya, karena kalo diisi 0 maka outputnya akan 0 karena itu akan menjadi nilai dasar untuk membandingkannya
        int lulus = 0, tidakLulus = 0; //dikasi 0 karena itu jadi nilai dasar

        for (int i = 1; i <= 10; i++){
            System.out.println("Masukkan nilai mahasiswa ke- " + i + " : ");
            nilai = sc.nextDouble();
            
            //terdapat 2 if, karena terjadi 2 kali pengecekan. 
            //contohnya nilainya sama 50,50,50. itukan tertinggi= 50 dan terendah= 50.
            //kalo udah jadi yang tertinggi ga bisa jadi yang terendah 
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            if (nilai >= 60) {
                ++lulus; //kalo pake lulus++ nanti tidak dioperasikan dulu
            } else {
                ++tidakLulus;
            }

        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Terdapat " + lulus + " mahasiswa lulus dan " + tidakLulus + " tidak lulus.");
    }
}
