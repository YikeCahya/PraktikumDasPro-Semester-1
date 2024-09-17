package LatihanKuisDasPro1;
import java.util.Scanner;

public class HambatanParalel {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);

        double r1, r2, r3;

        System.out.println("R1nya ");
        r1 = sc.nextDouble();
        System.out.println("R2nya ");
        r2 = sc.nextDouble();
        System.out.println("R3nya ");
        r3 = sc.nextDouble();

        double rTotal = 1/((1/r1)+(1/r2)+(1/r3));

        System.out.println("Hambatan totalnya adalah " + rTotal);
    }
}
