package CollectionTreeSet_TreeMap4_5.task1;

public class Contact {
    private String name;
    private String surname;
    private String phoneNumber;
    private Group group;

    public Contact(String name, String surname, String phoneNumber, Group group) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Group getGroup() {
        return group;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, (%s)", phoneNumber, surname, name, group);
    }
}
