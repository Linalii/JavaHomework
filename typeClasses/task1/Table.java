package hw.oopTask.typeClasses.task1;

public class Table extends Furniture{
    private boolean constructed;
    private Lock lock;
    @Override
    public void deconstruct() {

    }

    @Override
    public void construct() {

    }
    public class Lock{
        public void lock(){
            if (!constructed){
                System.out.println("Стол защелкнут");
            }
        }
        public void unlock(){
            if (!constructed){
                System.out.println("Стол расщелкнут");
            }
        }
    }
}
