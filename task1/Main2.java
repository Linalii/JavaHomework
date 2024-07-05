package ru.relex.task1;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        String login1, login2;
        Scanner scanner = new Scanner(System.in);
        login1 = scanner.next();
        login2 = scanner.next();
        System.out.println(login1.equals(login2)?"нельзя отправить сообщение самому себе":"Сообщение отправлено");
    }
}
