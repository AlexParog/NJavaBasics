package CollectionHashSet_HashMap4_3.task1;

import java.util.Objects;

public class Contact {
    private String phoneName;
    private String phoneNumber;

    public Contact(String phoneName, String phoneNumber) {
        this.phoneName = phoneName;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return phoneNumber.equals(contact.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber);
    }

    @Override
    public String toString() {
        return "Имя: " + phoneName + ", " + "Телефон: " + phoneNumber;
    }
}
