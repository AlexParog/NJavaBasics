package CollectionQueue4_2.task1;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class MainTask1 {
    public static void main(String[] args) {
        Queue<Integer> floors = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        int totalSeconds = 0;

        while (true) {
            System.out.println("Ожидаю ввода этажа: (для завершения введите 0)");
            int input = scanner.nextInt();
            if (input >= 0 && input <= 25) {
                floors.add(input);
            } else System.out.println("Такого этажа нет в доме.");

            if (input == 0) {
                System.out.println("Лифт проследовал по следующим этажам:");
                totalSeconds = printSecondsAndPriorityQueue(floors, totalSeconds);
                break;
            }
        }
        System.out.println();
        System.out.println("Время затраченное лифтом на маршрут = " + totalSeconds + " с.");
    }

    public static int printSecondsAndPriorityQueue(Queue<Integer> floors, int totalSeconds) {
        final int waitDoorsInSeconds = 10;
        final int waitMoveInSeconds = 5;
        int previousFloor = -1;
        int currentFloor = -1;

        while (floors.peek() != null) {
            currentFloor = floors.poll();
            System.out.print("этаж " + currentFloor + " -> ");
            if (previousFloor != -1) {
                totalSeconds += Math.abs(currentFloor - previousFloor) * waitMoveInSeconds;
                totalSeconds += waitDoorsInSeconds;
            }
            previousFloor = currentFloor;
        }
        System.out.println("Завершение");
        return totalSeconds;
    }
}