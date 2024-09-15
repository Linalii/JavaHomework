package hw.oopTask.mapTasks;

import java.util.*;
//Создайте Map, содержащую информацию о количестве студентов,
// обучающихся в каждом курсе на факультете.
//    Напишите метод, который принимает на вход Map
//    с оценками студентов и возвращает список студентов, у которых средний балл выше 4.
public class Main2 {
    public static void main(String[] args) {
        Map<Integer, Integer> studentsCount = new HashMap<Integer, Integer>();
        Map <String , List<Integer>> studentsMark = new HashMap<String , List<Integer>>();
        List<Integer> goodMarks = new ArrayList<Integer>();
        goodMarks.add(5);
        goodMarks.add(5);
        goodMarks.add(5);
        List<Integer> badMarks = new ArrayList<Integer>();
        badMarks.add(2);
        badMarks.add(2);
        badMarks.add(2);
        studentsMark.put("Ivan", goodMarks);
        studentsMark.put("Kolya", badMarks);
        studentsMark.put("Oleg", goodMarks);
        studentsMark.put("Sasha", badMarks);
        System.out.println(studentsMark);
        System.out.println(goodStudents(studentsMark));
    }
    public static List<String> goodStudents(Map <String , List<Integer>> studentsMark) {
        List<String> goodStudents = new ArrayList<String>();
        Set<Map.Entry<String, List<Integer>>> students = studentsMark.entrySet();
        int sum = 0;
            for (Map.Entry<String, List<Integer>> entry: students) {
                List<Integer> marks = entry.getValue();
                for (int j = 0; j < marks.size(); j++) {
                    sum = sum + marks.get(j);
                }
                if(sum/marks.size() >= 4){
                    goodStudents.add(entry.getKey());
                }
                sum = 0;
            }
        return goodStudents;
    }
}
