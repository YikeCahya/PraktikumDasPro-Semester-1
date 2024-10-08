//package PraktikumDasPro-Jobsheet6;
import java.util.Scanner;

public class TahunKabisat28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tahun;

        System.out.print("Masukkan tahun: ");
        tahun = sc.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("Tahun " + tahun + " bukan merupakan tahun kabisat.");
            } else if (tahun % 400 == 0){
                System.out.println("Tahun " + tahun + " merupakan tahun kabisat.");
            } else {
                System.out.println("Tahun " + tahun + " bukan merupakan tahun kabisat.");
            }
        } else {
            System.out.println("Tahun " + tahun + " bukan merupakan tahun kabisat.");


        }
    }
}
