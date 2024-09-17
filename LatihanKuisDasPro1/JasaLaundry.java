package LatihanKuisDasPro1;
import java.util.Scanner;

public class JasaLaundry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double beratLaundry;
        int hargaPerkg = 2000;

        System.out.print("Masukkan berat barang ");
        beratLaundry = sc.nextDouble();

        double hargaTotal = beratLaundry * hargaPerkg;

        System.out.println("Total yang harus dibayarkan untuk " + beratLaundry + "kg adalah Rp " + hargaTotal );
    }
    
}
