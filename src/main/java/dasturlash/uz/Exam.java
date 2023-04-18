package dasturlash.uz;

import java.time.LocalDate;
import java.util.Set;

public class Exam {
    private String date;
    private Set<Student> studentSet;

    public Exam(String date, Set<Student> studentSet) {
        this.date = date;
        this.studentSet = studentSet;
    }

    @Override
    public String toString() {
        return "Exam{" + "lesson=" + date + ", studentSet=" + studentSet + '}';
    }
}
