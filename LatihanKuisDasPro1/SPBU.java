package LatihanKuisDasPro1;
import java.util.Scanner;

public class SPBU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double jumlahUang, hargaPerLiter = 9000;

        System.out.print("Masukkan umlah uang Rp ");
        jumlahUang = sc.nextDouble();

        double bahanBakar = jumlahUang / hargaPerLiter;

        System.out.println("Bahan bakar yang diperoleh " + bahanBakar + "L");
        
    }
}
