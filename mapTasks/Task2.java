package hw.oopTask.mapTasks;

import java.util.ArrayList;
import java.util.List;
//Написать метод который вернет число
// которое чаще всего  встречается в листе
// а если таких несколько вернет одно из них любое все равно одно и тоже число будет
public class Task2 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(3);
        nums.add(20);
        nums.add(20);
        nums.add(20);
        nums.add(20);
        nums.add(20);
        nums.add(20);
        nums.add(20);
        nums.add(20);
        nums.add(20);
        nums.add(20);
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(frequentNum(nums));
    }
    public static int frequentNum(List<Integer> nums){
        int result = 0;
        int count = 0;
        int numToCompare = 0;
        for (int i = 0; i < nums.size(); i++) {
            numToCompare = nums.get(i);
            if(result < count){
                result = count;
            }
            count = 0;
            for (int j = 0; j < nums.size(); j++) {
                if (numToCompare == nums.get(j)) {
                    count++;
                }
            }

        }
        return nums.get(result);
    }
}
