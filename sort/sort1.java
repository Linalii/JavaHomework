package hw.oopTask.sort;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Отсортировать список пользователей по возрасту,
// а при одинаковом возрасте - по имени в алфавитном порядке
public class sort1 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();
        User user1 = new User("Яна", 80);
        User user2 = new User("Анна",80);
        User user3 = new User("Максим",22);
        User user4 = new User("Анна",22);
        User user5 = new User("Галя",35);
        User user6 = new User("Анна",12);
        User user7 = new User("Галя",19);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        Collections.sort(users);
        for (User user : users) {
            System.out.println(user);
        }

    }
}
