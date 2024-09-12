import java.util.Scanner;
public class TarifListrik28 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int totalPenggunaanListrik;
        int tarif = 1500;

        System.out.print("Masukkan total penggunaan listrik dalam kWh: ");
        totalPenggunaanListrik = input.nextInt();

        double totalTarifPenggunaanListrik = totalPenggunaanListrik * tarif;

        System.out.println("Total tarif penggunaan listrik adalah Rp " + totalTarifPenggunaanListrik);
        System.out.println("Apakah total tagihan lebih dari 500 kWh? " + (totalPenggunaanListrik>500));

    }
}
