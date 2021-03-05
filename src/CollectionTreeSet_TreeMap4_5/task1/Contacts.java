package CollectionTreeSet_TreeMap4_5.task1;

import java.util.HashMap;
import java.util.Map;

public class Contacts {
    private HashMap<String, Contact> storage = new HashMap<>();

    public HashMap<String, Contact> getStorage() {
        return storage;
    }

    // добавление контакта
    public void addContact(String name, String surname, String phoneNumber, Group group) {
        this.storage.put(phoneNumber, new Contact(name, surname, phoneNumber, group));
    }

    // удаление контакта
    public void deleteContact(String name, String surname) {
        boolean lever = false;
        for (Map.Entry<String, Contact> entry : this.storage.entrySet()) {
            String n = entry.getValue().getName();
            String s = entry.getValue().getSurname();
            if (n.equals(name) && s.equals(surname)) {
                this.storage.remove(entry.getKey());
                System.out.println("Контакт успешно удален!");
                lever = true;
            }
        }
        if (!lever) {
            System.out.println("Контакт не найден...");
        }
    }

    public String toString(){
        StringBuilder w = new StringBuilder();
        StringBuilder fri = new StringBuilder();
        StringBuilder fam = new StringBuilder();
        for (Map.Entry<String, Contact> entry : this.storage.entrySet()){
            String key = entry.getKey();
            Group gr = this.storage.get(key).getGroup();
            switch (gr){
                case WORK:
                    w.append(entry + "\n");
                case FRIENDS:
                    fri.append(entry + "\n");
                case FAMILY:
                    fam.append(entry + "\n");
            }
        }
        String r = "Работа " + "\n" + w.toString() + "\n" + "Друзья " + fri.toString() + "\n"
                + "Семья " + "\n" + fam.toString();
        return r;
    }
}
