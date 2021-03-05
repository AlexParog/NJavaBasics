package Polymorphism3_2_1;

import Polymorphism3_2_1.player.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );
        int slot;

        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                System.out.println("Game over!");
            } else {
                slot = input - 1;
                player.shotWeapon(slot);
            }
        }
    }
}
