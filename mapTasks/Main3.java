package hw.oopTask.mapTasks;

import java.util.*;

//Создайте Map, содержащую информацию
// о количестве товаров на складе каждого типа.
//    Напишите метод, который принимает на вход Map
//    с ценами товаров и возвращает список товаров, стоимость которых не превышает заданную.
public class Main3 {
    public static void main(String[] args) {
        Map<String, Integer> productsCount = new HashMap<>();
        productsCount.put("Apple", 1);
        productsCount.put("Bananas", 2);
        productsCount.put("Grapes", 3);
        productsCount.put("Mango", 4);
        System.out.println(productsNeededPrice(productsCount, 3));
    }
    public static List<String> productsNeededPrice(Map<String, Integer> products, int neededPrice) {
        List<String> productsNeeded = new ArrayList<>();
        Set<Map.Entry<String, Integer>> productsSet = products.entrySet();
        for(Map.Entry<String, Integer> entry: productsSet){
            if(entry.getValue()>= neededPrice){
                productsNeeded.add(entry.getKey());
            }
        }
        return productsNeeded;
    }
}
