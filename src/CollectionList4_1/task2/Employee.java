package CollectionList4_1.task2;

public class Employee {
    private String surname;
    private String name;
    private String age;
    private String person;
    private String education;
    private String position;
    private String department;

    public Employee(String surname, String name, String age, String person,
                    String education, String position, String department) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.person = person;
        this.education = education;
        this.position = position;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return surname + name + age
                + person + education
                + position + department;
    }
}
