package CollectionList4_1.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        while (true) {
            System.out.println(("Введите информацию о сотруднике (фамилия, имя, возраст, пол, образование, должность, отдел"));
            System.out.println("Введите фамилию.");
            String surname = scanner.next();
            System.out.println("Введите имя.");
            String name = scanner.next();
            System.out.println("Введите возраст.");
            String age = scanner.next();
            System.out.println("Введите пол.");
            String person = scanner.next();
            System.out.println("Введите образование.");
            String education = scanner.next();
            System.out.println("Введите должность.");
            String position = scanner.next();
            System.out.println("Введите отдел.");
            String department = scanner.next();

            Employee emp = new Employee(surname, name, age, person, education, position, department);
            list.add(emp.getSurname());
            list.add(emp.getName());
            list.add(emp.getAge());
            list.add(emp.getPerson());
            list.add(emp.getEducation());
            list.add(emp.getPosition());
            list.add(emp.getDepartment());

            System.out.println("Если хотите закончить ввод данных, введите end");
            String input = scanner.next();
            if ("end".equals(input)) {
                printList(list);
                break;
            }
        }
    }

    public static void printList(List<String> list) {
        String surname, name, age, person,
                education, position, department;

        System.out.println();
        System.out.println("Список сотрудников:");
        System.out.printf("%-10s%14s%14s%16s%16s%16s%16s%n", "Фамилия", "Имя",
                "Возраст", "Пол", "Образование", "Должность", "Отдел");
        for (int i = 0; i < list.size(); i += 7) {
            surname = list.get(i);
            name = list.get(i + 1);
            age = list.get(i + 2);
            person = list.get(i + 3);
            education = list.get(i + 4);
            position = list.get(i + 5);
            department = list.get(i + 6);
            System.out.printf("%-10s%14s%14s%16s%16s%16s%16s%n", surname,
                    name, age, person, education, position, department);
        }
    }
}
