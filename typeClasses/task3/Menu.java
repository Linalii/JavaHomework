package hw.oopTask.typeClasses.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    List<Phone> basket = new ArrayList<Phone>();
    public void start(Phone ... phone){
        int answer = -1;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < phone.length; i++){
            System.out.println(phone[i].getModel()+ " - "+(i+1));
        }
        while (answer != 0){
            System.out.println("0 - Завершить, 1-4 добавить нужный телефон, 6 - Корзина, 7 - Очистить корзину");
            answer = scanner.nextInt();
            if (answer == 6){
                int allPrice = 0;
                for (Phone phoneToShow: basket
                     ) {
                    System.out.println(phoneToShow.getModel());
                    allPrice = allPrice + phoneToShow.getPrice();
                }
                System.out.println("Общая стоимость: "+allPrice);
            }else if(answer == 7){
                basket.clear();
            }
            else if (answer!=0){
                basket.add(phone[answer-1]);
            }else break;
        }


    };
}
