package hw.oopTask.typeClasses.task3;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("Xiaomi", 10000);
        Phone phone1 = new Phone("TLD", 2500);
        Phone phone2 = new Phone("Samsung", 25000);
        Phone phone3 = new Phone("iphone",999999);
        Phone phone4 = new Phone("Honor", 15000);
        Menu menu = new Menu();
        menu.start(phone,phone1,phone2,phone3,phone4);

    }
}
