//package PraktikumDasPro-Jobsheet9;
import java.util.Scanner;

public class Star28 {
    public static void main(String[] args) {
        Scanner ike = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = ike.nextInt();

        for(int i = 0; i <= N; i++) {
            System.out.print("*");
        }
    }
}
