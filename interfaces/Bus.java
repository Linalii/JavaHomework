package hw.oopTask.interfaces;

public class Bus {
    Passenger [] passengers = new Passenger[20];
    public void addPassenger(Passenger passenger){
        int indexToAdd = findNull();
        if (indexToAdd != -1){
            this.passengers[indexToAdd] = passenger;
        }
        else {
            showLeftSeat();
        }
    }
    public void showLeftSeat(){
        System.out.println(findNull()== -1 ? "Мест нет" : "Осталост мест: "+(this.passengers.length - findNull()));
    }
    public int findNull(){
        int nullIndex = -1;
        int i = 0;
        while (i < this.passengers.length){
            if (this.passengers[i]==null){
                nullIndex = i;
                i = this.passengers.length;
            }
            i++;
        }
        return nullIndex;
    }

}
