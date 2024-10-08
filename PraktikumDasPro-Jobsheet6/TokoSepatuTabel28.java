import java.util.Scanner;

public class TokoSepatuTabel28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String merek, kategori;
        int ukuran, harga = 0;

        System.out.print("Masukkan merek sepatu: ");
        merek = sc.nextLine();
        System.out.print("Masukkan kategori sepatu: ");
        kategori = sc.nextLine();
        System.out.println("Masukkan ukuran: ");
        ukuran = sc.nextInt();

        if (merek.equalsIgnoreCase("converse")) {
            if (kategori.equalsIgnoreCase("Slip On") && ukuran >= 36 && ukuran <= 40) {
                harga = 800000;
            } else if (kategori.equalsIgnoreCase("High Top") && ukuran >= 40 && ukuran <= 44) {
                harga = 1200000;
            } else {
                harga = 0;
                System.out.println("Kategori atau ukuran tidak tersedia");
            }
        } else if (merek.equalsIgnoreCase("Sketcher")) {
            if (kategori.equalsIgnoreCase("Woman") && ukuran >= 36 && ukuran <= 41) {
                harga = 1000000;
            } else if (kategori.equalsIgnoreCase("Man") && ukuran >= 41 && ukuran <= 44) {
                harga = 1800000;
            } else {
                harga = 0;
                System.out.println("Kategori atau ukuran tidak tersedia");
            }
        } else if (merek.equalsIgnoreCase("Nike")) {
            if (kategori.equalsIgnoreCase("Kids") && ukuran >= 36 && ukuran <= 40) {
                harga = 750000;
            } else if (kategori.equalsIgnoreCase("Adult") && ukuran >= 40 && ukuran <= 44) {
                harga = 1500000;
            } else {
                harga = 0;
                System.out.println("Kategori atau ukuran tidak tersedia");
            }
        } System.out.println("Sepatu dengan merek " + merek + " kategori " + kategori + " ukuran " + ukuran + " seharga Rp " + harga );
    } 
}
