import java.util.Scanner;
public class SIAKAD28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim, kelas;
        

        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

        System.out.print("Masukkan nama:");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM:");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas:");
        kelas = sc.nextLine();
        System.out.print("Masukkan nomor absen:");
        absen = sc.nextByte();

        System.out.print("Masukkan nilai kuis:");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas:");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS:");
        nilaiUAS = sc.nextDouble();

        nilaiAkhir = ((nilaiKuis * 0.2) + (nilaiTugas * 0.15) + (nilaiUTS * 0.3) + (nilaiUAS * 0.35));

        String nilaiHuruf, kualifikasi;

        if (nilaiAkhir <= 100 && nilaiAkhir > 80) {    
            nilaiHuruf = "A";
            kualifikasi = "Sangat baik";
        } else if (nilaiAkhir <= 80 && nilaiAkhir > 73) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari baik";
        } else if (nilaiAkhir <= 73 && nilaiAkhir > 65) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiAkhir <= 65 && nilaiAkhir > 60) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari cukup";
        } else if (nilaiAkhir <= 60 && nilaiAkhir > 50) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        } else if (nilaiAkhir <= 50 && nilaiAkhir > 39) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        } else {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }

        System.out.println("Nama:" + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas:" + kelas);
        System.out.println("Absen:" + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai akhir huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
    }
    
}
