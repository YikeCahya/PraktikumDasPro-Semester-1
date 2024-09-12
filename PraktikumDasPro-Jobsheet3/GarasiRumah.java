import java.util.Scanner;

public class GarasiRumah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double alas, tinggi;

        System.out.print("Masukkan panjang alas (dalam meter): ");
        alas = sc.nextDouble();
        System.out.print("Masukkan tinggi (dalam meter): ");
        tinggi = sc.nextDouble();

        double luasGarasi = 1/2.0 * alas * tinggi;

        System.out.println("Luar garasi rumah adalah " + luasGarasi + "m");
    }
}
