package ru.relex.task5;

public class Smartphone {
    double memory;
    float price;

    public Smartphone(double memory, float price) {
        this.memory = memory;
        this.price = price;
    }

    public void turnOff(){
        System.out.println("смарфон включен");
    }
    public void turnOn(){
        System.out.println("смарфон выключен");
    }
}
