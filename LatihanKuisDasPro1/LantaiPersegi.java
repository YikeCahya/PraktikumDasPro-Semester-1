package LatihanKuisDasPro1;
import java.util.Scanner;

public class LantaiPersegi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sisiLantai, sisiKeramik;

        System.out.println(" Panjang sisi dari lantai ");
        sisiLantai = sc.nextDouble();
        System.out.println("panjang sisi keramik ");
        sisiKeramik = sc.nextDouble();

        double luasLantai = sisiLantai * sisiLantai;
        double luasKeramik = sisiKeramik * sisiKeramik;

        double jumlahKeramik = luasLantai / luasKeramik;

        System.out.println("Jadi jumlah keramik yang dibutuhkan adalah " + jumlahKeramik);
    }
}
