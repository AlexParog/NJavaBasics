package CollectionHashSet_HashMap4_3.task2;

import java.util.Objects;

public class Student {
    private String name;
    private String group;
    private final String studentId;

    public Student(String name, String group, String studentId) {
        this.name = name;
        this.group = group;
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public String toString() {
        return "  - " + name + ", " + group + ", " + studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }
}
