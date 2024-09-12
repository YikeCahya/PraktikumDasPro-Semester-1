import java.util.Scanner;

public class TabunganBuDina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTabunganAwal, lamaMenabung;
        double persentaseBunga = 0.02;

        System.out.print("Masukkan jumlah tabungan awal Rp ");
        jumlahTabunganAwal = sc.nextInt();
        System.out.println("Berapa lama menabung? ");
        lamaMenabung = sc.nextInt();

        double bunga = jumlahTabunganAwal * lamaMenabung * persentaseBunga;
        double jumlahTabunganAkhir = bunga + jumlahTabunganAwal;

        System.out.println("Jumlah besaran bunga yang didapatkan Rp " + bunga);
        System.out.println("Jumlah tabungan akhir yang didapatkan Rp " + jumlahTabunganAkhir);


    }
}
