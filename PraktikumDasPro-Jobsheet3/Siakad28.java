import java.util.Scanner;
public class Siakad28 {
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

        System.out.println("Nama:" + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas:" + kelas);
        System.out.println("Absen:" + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
    
}