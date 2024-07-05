package ru.relex.task5;

public class Xiaomi extends Smartphone {

    public Xiaomi(double memory, float price) {
        super(memory, price);
    }
    public double checkMemory() {
        return this.memory;
    }
}
