package CollectionHashSet_HashMap4_3.task1;

import java.util.Scanner;

public class MainTask1 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PhoneContacts phoneContacts = new PhoneContacts();

        while (true) {

            System.out.println("Введите название группы контактов или введите нет):");
            String in = scanner.nextLine();
            if ("нет".equals(in)) {
                break;
            } else phoneContacts.addGroup(in);
        }

        while (true) {

            System.out.println("Создать контакт (введите наименование и его номер или введите нет)?");
            String name = getValueFromUser("Введите имя контакта...");
            if ("нет".equals(name)) {
                phoneContacts.printStorage();
                break;
            }

            String phoneNumber = getValueFromUser("Укажите телефон контакта...");
            phoneContacts.printNameOfGroup();
            String group = getValueFromUser("В какую группу добавим?");

            phoneContacts.addContact(group, name, phoneNumber);

        }
    }

    private static String getValueFromUser(String text) {
        System.out.println(text);
        return scanner.nextLine();
    }
}
