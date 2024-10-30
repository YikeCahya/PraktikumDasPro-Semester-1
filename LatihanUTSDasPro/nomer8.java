package LatihanUTSDasPro;
import java.util.Scanner;

public class nomer8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hasil = 0;
        int bil1 = 3, bil2 = 5;
        for (int n = 0; n < bil1; n++) {
            hasil += bil2;
        }
        System.out.println(hasil);
    }
}
