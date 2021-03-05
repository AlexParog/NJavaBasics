package CollectionHashSet_HashMap4_3.task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneContacts {
    private Map<String, List<Contact>> storage = new HashMap<>();

    public Map<String, List<Contact>> getStorage() {
        return storage;
    }

    // Добавление контакта
    public void addContact(String group, String name, String phoneNumber) {
        if (this.storage.containsKey(group)) {
            this.storage.get(group).add(new Contact(name, phoneNumber));
        } else System.out.println("Такой группы не существует!");
    }

    // Добавление группы
    public void addGroup(String group) {
        this.storage.putIfAbsent(group, new ArrayList<Contact>());
    }

    // Вывод на экран название Групп
    public void printNameOfGroup() {
        System.out.println("Группы в справочнике:");
        for (Map.Entry<String, List<Contact>> entry : this.storage.entrySet()) {
            System.out.println("- " + entry.getKey());
        }
    }

    // Вывод на экран
    public void printStorage() {
        System.out.println("Группы в справочнике:");
        for (Map.Entry<String, List<Contact>> entry : this.storage.entrySet()) {
            System.out.println("- " + entry.getKey() + ":");
            for (Contact contact : entry.getValue()) {
                System.out.println(contact);
            }
        }
    }
}
