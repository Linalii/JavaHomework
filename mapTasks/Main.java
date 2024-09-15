package hw.oopTask.mapTasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//Создайте Map, содержащую информацию о количестве
// каждого уникального слова в заданном тексте.
// Напишите метод, который принимает на вход Map,
// содержащую информацию о количестве уникальных слов в тексте,
// и выводит топ-10 самых часто встречающихся слов.
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> uniqueWordCount = new HashMap<>();
        uniqueWordCount.put("Word",1000);
        uniqueWordCount.put("One",1000);
        uniqueWordCount.put("Two",1000);
        uniqueWordCount.put("Words",1000);
        uniqueWordCount.put("Onse",1000);
        uniqueWordCount.put("Twsdo",1000);
        uniqueWordCount.put("Woasrd",1000);
        uniqueWordCount.put("Odddcne",45);
        uniqueWordCount.put("Twcscxo",1000);
        uniqueWordCount.put("Wzcxzord",3000);
        uniqueWordCount.put("Onzce",1000);
        uniqueWordCount.put("Twczco",12);
        showFrequentWords(uniqueWordCount);


    }
    public static void showFrequentWords(Map<String, Integer> words){
        //?EntrySet
        Map<String, Integer> test = new HashMap<>();
        Set<Map.Entry<String, Integer>> setToShow = words.entrySet();
        String index = "";
        int numberToCompare = 0;
        for(int i = 0; i < 10; i++){
            for (Map.Entry<String,Integer> entry : setToShow){
                if(entry.getValue()>numberToCompare){
                    numberToCompare = entry.getValue();
                    index = entry.getKey();
                }
            }
            test.put(index,numberToCompare);
            setToShow.remove(Map.entry(index,numberToCompare));
            index = "";
            numberToCompare = 0;
        }
        System.out.println(test);

    }
}
