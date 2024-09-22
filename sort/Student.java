package hw.oopTask.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    List<Integer> marks = new ArrayList<>();

    public Student(List<Integer> marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(marks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                '}'+
                " Average - "+ findAverage()+" ";
    }

    public int findAverage() {
        int sum = 0;
        for (Integer mark : marks) {
            sum += mark;
        }
        return sum / marks.size();
    }
    public List<Integer> getMarks() {
        return marks;
    }
}
