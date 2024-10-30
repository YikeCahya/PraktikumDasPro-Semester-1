import java.util.Scanner;

public class AngkaBerpola {
    public static void main(String[] args) {
        Scanner ike = new Scanner(System.in);

        System.out.print("Masukaan nilai N = ");
        int N = ike.nextInt();

        for(int iOuter = 0; iOuter < N; iOuter++) {
            for(int i = 0; i < N; i++) {

                if (iOuter == 0 || i == 0 || iOuter == N - 1 || i == N - 1) {
                    System.out.print(N + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
