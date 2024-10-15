package LatihanStudiKasusPemilihan2;

import java.util.Scanner;

public class LevelUpKarakterGame {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        int ep, level = 0, healthPotion = 0, manaPotion = 0;

        System.out.print("input experience points: ");
        ep = sc1.nextInt();
        System.out.print("input health potion: ");
        healthPotion = sc1.nextInt();
        System.out.print("input mana potion: ");
        manaPotion = sc1.nextInt();

        if (ep > 1000) {
            level = 1;
            if (ep > 3000 && healthPotion >= 1) {
                level = 2;
                if (ep > 5000 && manaPotion >= 1) {
                    level = 3;
                }
            }
        } else {
            System.out.println("Tidak bisa naik level");
        }

        System.out.println("Level pemain adalah " + level);

        


    }
}
