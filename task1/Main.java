package ru.relex.task1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    String city1, city2;
    Scanner scanner = new Scanner(System.in);
    city1 = scanner.next();
    city2 = scanner.next();
    if (city1.equals(city2)){
        System.out.println("нельзя купить билет");
    } else if (city1.equals("Мурманск")||city2.equals("Мурманск")) {
        System.out.println("в данный город и из данного города поезда временно приостановлены");
    }else {
        System.out.println("билет куплен");
    }
    }

}