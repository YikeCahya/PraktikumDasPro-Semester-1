import java.util.Scanner;

public class Penghasilan28 {
    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);

        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.print("Masukkan kategori (pekerja/pebisnis): ");
        kategori = input28.nextLine();
        System.out.print("Masukkan besarnya penghasilkan : ");
        penghasilan = input28.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000) {
                pajak = 0.1;
            } else if (penghasilan <= 3000000){
                pajak = 0.15;
            } else {
                pajak = 0.2;
            }
        } else if (kategori.equals("pebisnis")) {
            if (penghasilan <= 25000000) {
                pajak = 0.15;
            } else if (penghasilan <= 35000000) {
                pajak = 0.2;
            } else {
                pajak = 0.25;
            }
        } else {
            System.out.println("Masukan kategori salah ");
        }
        gajiBersih = (int) (penghasilan - (pajak * penghasilan));
        System.out.println("Penghasilan bersih: " + gajiBersih);
    }
}
