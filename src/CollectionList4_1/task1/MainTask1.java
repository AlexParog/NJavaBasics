package CollectionList4_1.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTask1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> affairs = new ArrayList<>();
        instructions();

        while (true) {
            System.out.println("Введите название задачи (для завершения введите end)");
            String task = scanner.nextLine();
            if ("end".equals(task)) {
                printAffairs(affairs);
                break;
            }
            affairs.add(task);
        }

        while (true) {
            System.out.println("Введите номер задачи, который хотите удалить (для завершения введите Finish)");
            String input = scanner.nextLine();
            if ("Finish".equals(input)) {
                if (affairs.size() == 0) {
                    System.out.println("Список задач: пусто");
                } else {
                    printAffairs(affairs);
                    break;
                }
            }
            int numb = Integer.parseInt(input);
            if (numb >= 1 && numb <= affairs.size()) {
                numb -= 1;
                affairs.remove(numb);
                printAffairs(affairs);
            } else {
                System.out.println("Задачи под таким номером не существует.");
            }
        }
    }

    public static void printAffairs(List<String> affairs) {
        int i = 0;
        System.out.println("Список задач:");
        for (String tsk : affairs) {
            i += 1;
            System.out.println(i + ". " + tsk);
        }
    }

    public static void instructions() {
        System.out.println("Функционал:");
        System.out.println("1. Добавить задачу");
        System.out.println("2. Вывести список задач");
        System.out.println("3. Удалить задачу");
        System.out.println("4. Выход");
    }
}
