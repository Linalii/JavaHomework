package ru.relex.task5;

import ru.relex.task5.Samsung;
import ru.relex.task5.Xiaomi;
import ru.relex.task5.iPhone;

public class Main5 {
    public static void main(String[] args) {
        Xiaomi xiaomi = new Xiaomi(12,20000);
        iPhone iphone = new iPhone(16,50000);
        Samsung samsung = new Samsung(12,40000);
        xiaomi.turnOn();
        xiaomi.turnOff();
        iphone.turnOn();
        iphone.turnOff();
        samsung.turnOn();
        samsung.turnOff();
        System.out.println(xiaomi.checkMemory());
    }
}
