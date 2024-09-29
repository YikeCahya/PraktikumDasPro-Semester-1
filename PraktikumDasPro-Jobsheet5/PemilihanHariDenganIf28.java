import java.util.Scanner;

public class PemilihanHariDenganIf28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dayNumber;
        String dayType;

        System.out.print("Masukkan bilangan: ");
        dayNumber = sc.nextInt();

        if (dayNumber >= 1 && dayNumber <= 5) {
            dayType = "Weekday";
            //System.out.println("Weekday");
        } else if (dayNumber >= 6 && dayNumber <= 7){
            dayType = "Weekend";
            //System.out.println("Weekend");
        } else {
            dayType = "Invalid Number";
            //System.out.println("Invalid Number");
        }

        System.out.println("It's " + dayType);
    }
}
