import java.util.Scanner;
public class TugasArray2 {
    public static void main(String[] args) {
        Scanner ike = new Scanner(System.in);

        int[][] nilai = new int[10][6];

        for(int i = 0; i < nilai.length; i++) {
            System.out.println("Responden ke-" + (i + 1) + ": ");
            double totalPerResponden = 0;

            for(int j = 0; j < nilai[i].length; j++) {
                System.out.print("Jawaban pertanyaan ke-" + (j + 1) + ": ");
                nilai[i][j] = ike.nextInt();
                totalPerResponden += nilai[i][j];
            }
            System.out.println("Rata-rata nilai per-responden: " + totalPerResponden / 6);
        }

        for(int j = 0; j < nilai[0].length; j++) {
            double totalPerPertanyaan = 0;

            for(int i = 0; i < nilai.length; i++) {
                totalPerPertanyaan += nilai[i][j];
            }
            System.out.println("Rata-rata nilai per-pertanyaan: " + totalPerPertanyaan / 10);
        }
    }
}
