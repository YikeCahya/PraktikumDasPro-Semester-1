import java.util.Scanner;

public class KonsumsiBahanBakar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double kecepatan, durasi;
        int kapasitasMesin;

        //perjalanan di Kota
        
        double kecepatanKota, durasiKota;
        
        System.out.print("Masukkan kecepatan di area kota (km/jam) ");
        kecepatanKota = sc.nextDouble();
        System.out.print("Masukkan durasi di area kota (jam) ");
        durasiKota = sc.nextDouble();
        System.out.print("Masukkan kapasitas mesin ");
        kapasitasMesin = sc.nextInt();

        double jarakTempuhKota = kecepatanKota * durasiKota;
        double konsumsiDiKota = (jarakTempuhKota / 100) * kapasitasMesin * 0.5;

        System.out.println("Konsumsi bahan bakar di area perkotaan adalah " + konsumsiDiKota );


        //perjalanan di jalan tol
        double kecepatanJalanTol, durasiJalanTol;
        
        System.out.print("Masukkan kecepatan di area Jalan Tol (km/jam) ");
        kecepatanJalanTol = sc.nextDouble();
        System.out.print("Masukkan durasi di area Jalan Tol (jam) ");
        durasiJalanTol = sc.nextDouble();
        System.out.print("Masukkan kapasitas mesin ");
        kapasitasMesin = sc.nextInt();

        double jarakTempuhTol = kecepatanJalanTol * durasiJalanTol;
        double konsumsiDiJalantol = (jarakTempuhTol / 100) * kapasitasMesin * 0.3;

        System.out.println("Konsumsi bahan bakar di jalan tol adalah " + konsumsiDiJalantol );


        //perjalanan di pegunungan
        double kecepatanPegunungan, durasiPegunungan;
        
        System.out.print("Masukkan kecepatan di area pegunungan (km/jam) ");
        kecepatanPegunungan = sc.nextDouble();
        System.out.print("Masukkan durasi di area pegunungan (jam) ");
        durasiPegunungan = sc.nextDouble();
        System.out.print("Masukkan kapasitas mesin ");
        kapasitasMesin = sc.nextInt();

        double jarakTempuhPegunungan = kecepatanPegunungan * durasiPegunungan;
        double konsumsiDiPegunungan = (jarakTempuhPegunungan / 100) * kapasitasMesin * 0.7;

        System.out.println("Konsumsi bahan bakar di area pegunungan adalah " + konsumsiDiPegunungan);


        //total konsumsi dan jarak bahan bakar di semua segmen
        double totalKonsumsi = konsumsiDiKota + konsumsiDiJalantol + konsumsiDiPegunungan;
        System.out.println("Total konsumsi bahan bakar di semua segmen adalah " + totalKonsumsi + " Liter");
        double totalJarakTempuh = jarakTempuhKota + jarakTempuhTol + jarakTempuhPegunungan;
        System.out.println("Total jarak yang ditempuh adalah " + totalJarakTempuh + " Km");

        //Rata-rata konsumsi yang dibutuhkan perkm
        double rataRataKonsumsi = totalKonsumsi / totalJarakTempuh;
        System.out.println("Rata-rata konsumsi bahan bakar perkm " + rataRataKonsumsi + " L/Km");

        //persentese konsumsi dari target bahan bakar harian
        double targetKonsumsi;
        
        System.out.print("Masukkan target konsumsi harian ");
        targetKonsumsi = sc.nextDouble();

        double persenteseTargetKonsumsi = totalKonsumsi / targetKonsumsi * 100;
        System.out.println("Persentase konsumsi bahan bakar harian adalah " + persenteseTargetKonsumsi + "%");

    }
}
