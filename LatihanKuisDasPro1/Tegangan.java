package LatihanKuisDasPro1;
import java.util.Scanner;

public class Tegangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r1, r2, r3, r4;
        double I;

        System.out.println("Masukkan R1, R2, R3, dan R4 secara berturut-turut ");
        r1 = sc.nextDouble();
        r2 = sc.nextDouble();
        r3 = sc.nextDouble();
        r4 = sc.nextDouble();

        System.out.println("Masukkan I ");
        I = sc.nextDouble();

        double rParalel = 1/((1/r1) + (1/r2) + (1/r3));
        double rTotal = rParalel + r4;
        double V = I * rTotal;

        System.out.println("Jadi teganganya adalah " + V);



    }
}
