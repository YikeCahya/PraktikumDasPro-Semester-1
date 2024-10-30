package LatihanUTSDasPro;
import java.util.Scanner;

public class nomer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, awal, akhir;

        System.out.println("Nilai awal: ");
        awal = sc.nextInt();
        System.out.println("Nilai akhir: ");
        akhir = sc.nextInt();

        if (awal > akhir) {
            System.out.println("Angka salah");
        }
        
        n = awal;
        while (n <= akhir) {
            System.out.println(n);
            n++;
        }
    }
}
