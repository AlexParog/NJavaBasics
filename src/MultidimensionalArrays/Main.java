package MultidimensionalArrays;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int SIZE = 8;

    public static void main(String[] args) {
        int[][] colors = new int[SIZE][SIZE];
        Random random = new Random();
        int[][] rotatedColors = new int[SIZE][SIZE];
        Scanner scanner = new Scanner(System.in);

        // Заполнение массива рандомными числами
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }

        // Вывод массива на экран
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }

        System.out.println("");
        System.out.println("---------------------------------");
        System.out.println("");
        System.out.println("Введите угол: 90, 180, 270");
        int input = scanner.nextInt();
        switch (input) {
            case (90):
                rotatedColors90(colors, rotatedColors);
                outputArray(rotatedColors);
                break;
            case (180):
                rotatedColors180(colors, rotatedColors);
                outputArray(rotatedColors);
                break;
            case (270):
                rotatedColors270(colors, rotatedColors);
                outputArray(rotatedColors);
                break;
            default:
                System.out.println("Невозможно преобразовать матрицу для данного угла!");
        }

    }

    // Вывод массива
    public static void outputArray(int[][] rotatedColors) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", rotatedColors[i][j]);
            }
            System.out.println();
        }
    }

    // Поворот на 90
    public static int[][] rotatedColors90(int[][] colors, int[][] rotatedColors) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColors[j][SIZE - 1 - i] = colors[i][j];
            }
        }
        return rotatedColors;
    }

    // Поворот на 180 градусов
    public static int[][] rotatedColors180(int[][] colors, int[][] rotatedColors) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColors[SIZE - 1 - i][ SIZE - 1 - j] = colors[i][j];
            }
        }
        return rotatedColors;
    }

    // Поворот на 270
    public static int[][] rotatedColors270(int[][] colors, int[][] rotatedColors) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColors[j][i] = colors[i][SIZE - 1 - j];
            }
        }
        return rotatedColors;
    }
}
