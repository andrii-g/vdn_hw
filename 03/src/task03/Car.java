package task03;

/**
 * Created by Andrii_Grygoruk on 9/12/2017.
 */
public class Car extends Vehicle {
    public Car(double coordinates, int price, int speed, int year) {
        super(coordinates, price, speed, year);
    }

    public String toString(){
        return super.toString();
    }
}
