package task03;

/**
 * Created by Andrii_Grygoruk on 9/12/2017.
 */
public class Ship extends Vehicle {
    int passengers;
    String port;

    public Ship(double coordinates, int price, int speed, int year, int passengers, String port) {
        super(coordinates, price, speed, year);
        this.passengers = passengers;
        this.port = port;
    }

    public String toString(){
        return super.toString() + "; passengers: " + this.passengers + "; port: " + this.port;
    }
}
