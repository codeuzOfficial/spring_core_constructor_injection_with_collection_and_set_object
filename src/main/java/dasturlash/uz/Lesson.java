package dasturlash.uz;

import java.util.List;

public class Lesson {
    private String name;
    private List<Student> studentList;

    public Lesson(String name, List<Student> studentList) {
        this.name = name;
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Lesson{" + "name='" + name + '\'' + ", studentList=" + studentList + '}';
    }
}
