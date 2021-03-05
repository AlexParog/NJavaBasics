package CollectionTreeSet_TreeMap4_5.task1;

import java.util.Scanner;

public class MainTask1 {
    public static void main(String[] args) {
        Contacts contacts = new Contacts();
        Scanner scanner = new Scanner(System.in);
        MissedCalls missedCalls = new MissedCalls();
        int fun;
        Group gr;
        Group[] group = Group.values();


        while (true) {

            System.out.println("Меню:\n" +
                    "1. Добавить контакт\n" +
                    "2. Добавить пропущенный вызов\n" +
                    "3. Вывести все пропущенные вызовы\n" +
                    "4. Очистить пропущенные вызовы\n" +
                    "5. Удалить контакт\n" +
                    "Выберите пункт из меню...");
            String input = scanner.nextLine();
            try {
                fun = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Неправильно введена функция!");
                continue;
            }

            switch (fun) {
                case 1:
                    while (true) {
                        System.out.println("Введите имя контакта...");
                        String name = scanner.nextLine();
                        System.out.println("Введите фамилию контакта...");
                        String surname = scanner.nextLine();
                        System.out.println("Введите номер телефона...");
                        String phone = scanner.nextLine();
                        while (true) {
                            System.out.println("Выберите группу..."
                                    + "\n" + "1." + group[0]
                                    + "\n" + "2." + group[1]
                                    + "\n" + "3." + group[2]);
                            input = scanner.nextLine();
                            try {
                                fun = Integer.parseInt(input);
                            } catch (NumberFormatException exception) {
                                System.out.println("Такой операции не существует! Попробуйте снова...");
                                continue;
                            }
                            if (fun >= 1 && fun <= 3) {
                                gr = group[fun - 1];
                                break;
                            } else {
                                System.out.println("Такой группы не существует! Попробуйте снова...");
                                continue;
                            }
                        }
                        contacts.addContact(name, surname, phone, gr);
                        System.out.println("Контакт создан!");
                        break;
                    }
                    break;
                case 2:
                    System.out.println("Введите номер абонента...");
                    String s = scanner.nextLine();
                    missedCalls.addMissed(s);
                    break;
                case 3:
                    missedCalls.toMissed(contacts);
                    break;
                case 4:
                    missedCalls.clear();
                    break;
                case 5:
                    System.out.println("Введите имя контакта...");
                    String inputName = scanner.nextLine();
                    String name = inputName;
                    System.out.println("Введите фамилию контакта...");
                    String inputSurname = scanner.nextLine();
                    String surname = inputSurname;
                    contacts.deleteContact(name, surname);
                    break;
            }
        }
    }
}
