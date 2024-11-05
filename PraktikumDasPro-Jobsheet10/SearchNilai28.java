import java.util.Scanner;

public class SearchNilai28 {
    public static void main(String[] args) {

        Scanner ike = new Scanner(System.in);
        //Menerima input
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int n = ike.nextInt();

        //Membuat array dengan ukuran n
        int[] arrNilai = new int[n];

        //Menerima input elemen array
        System.out.println("-----Nilai mahasiwa-----");
        for(int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = ike.nextInt();
        }

        //Menerima input nilai yang dicari
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = ike.nextInt();
        int hasil = -1;
        
        for(int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i; //Nyimpan index pas ditemuin
                break; //Keluar dari loop setelah ditemukan
            }
        }

        System.out.println();
        System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        System.out.println();

        //Menampilkan hasil pencarian
        if (hasil != -1) {
            System.out.println();
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        } else {
            System.out.println();
            System.out.println("Nilai yang dicari tidak ditemukan");
        }

    }
}
