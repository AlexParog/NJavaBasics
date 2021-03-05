package CollectionHashSet_HashMap4_3.task2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainTask2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Set<Student> storage = new HashSet<>();

        addStudent(storage);
        printAllStudent(storage);
    }

    private static void addStudent(Set<Student> storage) {
        while (true) {

            System.out.println("Введите информацию о студенте (для завершения работы программы введите \"end\")");
            String fullName = getValueFromUser("Введите ФИО...");
            if ("end".equals(fullName)) break;

            String groupNumber = getValueFromUser("Введите номер группы...");
            String studId = getValueFromUser("Введите номер студенческого билета...");

            Student student = new Student(fullName, groupNumber, studId);
            addStudentToStorage(storage, student);
        }
    }

    private static void addStudentToStorage(Set<Student> storage, Student student) {
        if (storage.contains(student)) {
            System.out.println("Такой пользователь существует!");
            return;
        }
        storage.add(student);
    }

    private static void printAllStudent(Set<Student> storage) {
        System.out.println("Список студентов:");
        for(Student student : storage) {
            System.out.println(student);
        }
    }

    private static String getValueFromUser(String text) {
        System.out.println(text);
        return scanner.nextLine();
    }
}
