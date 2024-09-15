package hw.oopTask.mapTasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Создайте Map, содержащую информацию о количестве посещений каждой страницы на сайте.
// Напишите метод, который принимает на вход Map
// с информацией о посещениях сайта и
// возвращает список страниц, которые были посещены более 100 раз.
public class Main5 {
    public static void main(String[] args) {
        Map<String, Integer> pageCount = new HashMap<>();
        pageCount.put("https://www.google.com", 100);
        pageCount.put("https://www.yandex.com", 300);
        System.out.println(goodPages(pageCount));
    }
    public static List<String> goodPages(Map<String, Integer> pageCount) {
        List<String> goodPages = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : pageCount.entrySet()) {
            if (entry.getValue() > 100) {
                goodPages.add(entry.getKey());
            }
        }
        return goodPages;
    }
}
