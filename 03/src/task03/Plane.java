package task03;

/**
 * Created by Andrii_Grygoruk on 9/12/2017.
 */
public class Plane extends Vehicle {
    int height;
    int passengers;

    public Plane(double coordinates, int price, int speed, int year, int height, int passengers) {
        super(coordinates, price, speed, year);
        this.height = height;
        this.passengers = passengers;
    }

    public String toString(){
        return super.toString() + "; height: " + this.height + "; passengers: " + this.passengers;
    }
}
