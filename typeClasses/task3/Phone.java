package hw.oopTask.typeClasses.task3;

public class Phone {
    private String model;
    private int price;

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public Phone(String model, int price) {
        this.model = model;
        this.price = price;
    }
    static class MicroSD{
        private double memory;
    }
    class Battery{
        private boolean state;
    }
}
