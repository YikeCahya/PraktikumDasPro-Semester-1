package LatihanUTSDasPro;
import java.util.Scanner;

public class nomer1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int awal, akhir, n;

        System.out.println("Nilai awal: ");
        awal = sc.nextInt();
        System.out.println("Nilai akhir: ");
        akhir = sc.nextInt();

        if (awal < akhir) {
            System.out.println("Angka masukan salah");
        } else {
            for (n = awal; n >= akhir; n--) {
                System.out.println(n);
            }
        }
    }
}
