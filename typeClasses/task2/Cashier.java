package hw.oopTask.typeClasses.task2;

public class Cashier implements BankEmployee{
    @Override
    public void showEmployeePosition() {
        System.out.println("Должность сотрудника - кассир");
    }
}
