package hw.oopTask.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Задание 2 отсортировать атвомобили
// по марке по алфавиту через сортировку по умолчанию (Comparable)
public class sort2 {
    public static void main(String[] args) {
        List<Auto> autos = new ArrayList<Auto>();
        Auto auto1 = new Auto("Cadillac");
        Auto auto2 = new Auto("Toyota");
        Auto auto3 = new Auto("Bmw");
        Auto auto4 = new Auto("Kia");
        Auto auto5 = new Auto("Tesla");
        Auto auto6 = new Auto("Skoda");
        autos.add(auto1);
        autos.add(auto2);
        autos.add(auto3);
        autos.add(auto4);
        autos.add(auto5);
        autos.add(auto6);
        Collections.sort(autos);
        for (Auto auto : autos) {
            System.out.println(auto);
        }
    }
}
