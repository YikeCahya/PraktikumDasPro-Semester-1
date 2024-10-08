import java.util.Scanner;

public class TigaBilangan {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan tiga bilangan:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Menggunakan Math.max untuk mencari bilangan terbesar
        int largest = Math.max(num1, Math.max(num2, num3));

        System.out.println("Bilangan terbesar adalah: " + largest);

    }
}
