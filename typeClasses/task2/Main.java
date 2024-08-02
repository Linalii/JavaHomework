package hw.oopTask.typeClasses.task2;

public class Main {
    public static void main(String[] args) {
        Cashier cashier = new Cashier();
        cashier.showEmployeePosition();
        BankEmployee admin = new BankEmployee() {
            @Override
            public void showEmployeePosition() {
                System.out.println("Должность сотрудника - администратор");
            }
        };
        BankEmployee consultant = new BankEmployee() {
            @Override
            public void showEmployeePosition() {
                System.out.println("Должность сотрудника - консультант");
            }
        };
        BankEmployee trainee = new BankEmployee() {
            @Override
            public void showEmployeePosition() {
                System.out.println("Должность сотрудника - стажер");
            }
        };
        admin.showEmployeePosition();
        consultant.showEmployeePosition();
        trainee.showEmployeePosition();
    }
}
