package hw.oopTask.learnToStringException.task2;

public class Calculator {
    public double sum(double ... numbers){
        double sum = 0;
        for (double num: numbers
             ) {
            sum = sum + num;
        }
        return sum;
    }
    public double minus(double num, double numToSubtract){
        return  num - numToSubtract;
    }
    public double multiply(double ... numbers){
        double sum = 1;
        for (double num: numbers
        ) {
            sum = sum * num;
        }
        return sum;
    }
    public int divide(int num, int numToSubtract){
        return num/numToSubtract;
    }
}
