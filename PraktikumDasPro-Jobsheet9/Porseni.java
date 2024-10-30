import java.util.Scanner;

public class Porseni {
    public static void main(String[] args) {
        Scanner ike = new Scanner(System.in);

        int n;
        System.out.print("Masukkan jumlah POLITEKNIK = ");
        n = ike.nextInt();
        System.out.println("-------------------------------");

        for (int i = 1; i <= n; i++) {
            System.out.println("Masukkan nama POLITEKNIK ke-" + i + " ");

            Scanner ike2 = new Scanner(System.in);
            String poltek = ike2.nextLine();

            System.out.println("-------------------------------");
            System.out.println(i + " " + poltek);

            for (int j = 1; j <= 4; j++) {
                System.out.println("-------------------");
                System.out.println("Cabang Olahraga (Masukkan angka)");
                System.out.println("1. Badminton ");
                System.out.println("2. Tenis meja ");
                System.out.println("3. Basket ");
                System.out.println("4. Bola voly ");
                System.out.println("-------------------");

                Scanner ike3 = new Scanner(System.in);
                int cabor = ike3.nextInt();

                System.out.println("  ");

                String namaCabor;
                if (cabor == 1) {
                    namaCabor = "Badminton";
                } else if (cabor == 2){
                    namaCabor = "Tenis meja";
                } else if (cabor == 3){
                    namaCabor = "Basket";
                }else if (cabor == 4){
                    namaCabor = "Bola voly";
                }else{
                    continue;
                }

                System.out.println(cabor + ". " + namaCabor);

                System.out.println("Masukkan nama atlet");


                for (int k = 1; k <= 5; k++) {
                    System.out.print(k + ".");
                    Scanner ike4 = new Scanner(System.in);
                    String nama = ike4.nextLine();
                    //System.out.println(nama);
                }
            }
        }
    }
}
