package hw.oopTask.mapTasks;

import java.text.DateFormatSymbols;
import java.text.Format;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Создайте Map, содержащую информацию о количестве заказов в интернет-магазине по каждому месяцу.
//    Напишите метод, который принимает на вход Map
//    с информацией о заказах и возвращает общую сумму заказов за заданный период времени.
public class Main4 {
    public static void main(String[] args) {
        LocalDate month = LocalDate.now();
        int monthCurr = month.getMonthValue();
        Map<Integer, Integer> monthOrders = new HashMap<>();
        monthOrders.put(1,10);
        monthOrders.put(2,20);
        monthOrders.put(5,300);
        monthOrders.put(7,2);
        monthOrders.put(11,54);
        monthOrders.put(12,100);
        System.out.println(totalAmount(monthOrders, 1, 5));

    }
    public static int totalAmount(Map<Integer, Integer> monthOrders, int from, int to) {
        int amount = 0;
        Set<Map.Entry<Integer, Integer>> orderSet = monthOrders.entrySet();
        for(Map.Entry<Integer, Integer> entry : orderSet) {
            if(entry.getKey()>= from && entry.getKey()<= to) {
                amount = amount+ entry.getValue();
            }
        }
        return amount;
    }

}
