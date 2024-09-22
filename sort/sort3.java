package hw.oopTask.sort;

import collection.comparator.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Задание 3 отсортировать Учеников
// по их средней оценкев классе ученик
// будет лист оценок который  принимаесят при создании  объекта ученика
public class sort3 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        Student student = new Student(Arrays.asList(3, 3, 3, 4, 3));
        Student student2 = new Student(Arrays.asList(4, 2, 4, 4, 5));
        Student student3 = new Student(Arrays.asList(5, 5, 5, 5, 5));
        Student student4 = new Student(Arrays.asList(2, 2, 2, 2, 5));
        students.add(student);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        Comparator<Student> averageComparator = (o1, o2)->{
            return Integer.compare(o1.findAverage(), o2.findAverage());
        };
        students.sort(averageComparator);
        for(Student student1 : students) {
            System.out.println(student1);
        }

    }
}
