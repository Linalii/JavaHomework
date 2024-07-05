package ru.relex.task2;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int firstNum, secondNum;
        String sign = "";
        Scanner scanner = new Scanner(System.in);
        firstNum = scanner.nextInt();
        secondNum = scanner.nextInt();
        System.out.println("Введите знак");
        sign = scanner.next();
        switch (sign){
            case "+" :
                System.out.println(firstNum + secondNum);
            case "-" :
                System.out.println(firstNum - secondNum);
            case "*" :
                System.out.println(firstNum * secondNum);
            case "/" :
                System.out.println(secondNum == 0 ? "На ноль делить нельзя" : firstNum / secondNum);
            default:
                System.out.println("Ввели неверный знак");
        }
    }
}
