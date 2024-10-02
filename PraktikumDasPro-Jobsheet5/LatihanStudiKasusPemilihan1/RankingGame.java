package LatihanStudiKasusPemilihan1;
import java.util.Scanner;

public class RankingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int poin;
        String kategori;

        System.out.print("Poin yang diperoleh ");
        poin = sc.nextInt();

        if (poin >= 1000) {
            kategori = "Master";
        } else if (999 >= poin && poin >=500){
            kategori = "Expert";
        } else if (499 >= poin && poin >= 200){
            kategori = "Intermediate";
        } else {
            kategori = "Beginner";
        }

        System.out.println("Kategori pemain adalah " + kategori);
    }
}
