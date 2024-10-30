package UTS;
import java.util.Scanner;

public class GameRPG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nyawaPemain = 0, nyawaMusuh = 0, kekuatanPemain = 0, kekuatanMusuh = 0;
        int ronde = 1;
        //String keluar;
        System.out.println(" ");
        System.out.print("Masukkan nyawa awal pemain: ");
        nyawaPemain = sc.nextDouble();
        System.out.print("Masukkan nyawa awal musuh: ");
        nyawaMusuh = sc.nextDouble();

        do {


            System.out.print("Masukkan kekuatan serangan pemain: ");
            kekuatanPemain = sc.nextDouble();
            System.out.print("Masukkan kekuatan serangan musuh: ");
            kekuatanMusuh = sc.nextDouble();

            
            System.out.println(" ");
            System.out.println("=== Ronde "  + ronde + " ===");
            nyawaMusuh -= kekuatanPemain; 
            System.out.println("Pemain menyerang! Nyawa musuh tersisa: " + nyawaMusuh);
            nyawaPemain -= kekuatanMusuh;
            System.out.println("Musuh menyerang! Nyawa pemain tersisa: " + nyawaPemain);
            System.out.println(" ");

            ronde = ronde + 1;
            if (nyawaMusuh <= 0 || nyawaPemain <= 0) {
                System.out.println("kalah!");
                break;
            }


            if (nyawaMusuh <= 20 || nyawaPemain <= 20) {
                
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Pemain berada dalam kondisi kritis");
                System.out.println("Apakah anda ingin melarikan diri? (ya/tidak)");
                String keluar;
                keluar = sc2.nextLine();

                if (keluar.equalsIgnoreCase("ya")) {
                    System.out.println("Kalah");
                    break;
                } 
                //continue;
                
            }
        

        } while (true);
        
    }
}
