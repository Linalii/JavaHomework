package hw.oopTask.learnToStringException.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Calculator calculator = new Calculator();
    try (Scanner scan = new Scanner(System.in)){
        System.out.println(calculator.divide(scan.nextInt(), scan.nextInt()));
    }catch (InputMismatchException e){
        System.out.println("Нельзя вводить символы");
    }
    catch (ArithmeticException e){
        System.out.println("На ноль делить нельзя!");
    }
    }
}
