package LatihanKuisDasPro1;
import java.util.Scanner;

public class HambatanSeri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r1, r2, r3;

        System.out.println("Hambatannya ");
        r1 = sc.nextInt();
        r2 = sc.nextInt();
        r3 = sc.nextInt();

        int rTotal = r1 + r2 + r3;

        System.out.println("Total hambatan " + rTotal);

    }
}
