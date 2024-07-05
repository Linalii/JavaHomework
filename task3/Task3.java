package ru.relex.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String month[] = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int inputMonth;
        Scanner scanner = new Scanner(System.in);
        inputMonth = scanner.nextInt();
        System.out.println(inputMonth < 12 ? month[inputMonth-1]:"В году только 12 месяцев");
    }
}
