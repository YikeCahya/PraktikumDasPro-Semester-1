package LatihanKuisDasPro1;
import java.util.Scanner;

public class Percepatan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double V0, Vt, t;

        System.out.print("Kecepatan awalnya ");
        V0 = sc.nextDouble();
        System.out.print("Kecepatan akhirnya ");
        Vt = sc.nextDouble();
        System.out.print("Lama waktunya");
        t = sc.nextDouble();

        double a = (Vt-V0)/t;
        
        System.out.println("Jadi percepatan yang diperoleh adalah " + a);
        
    }
}
