package task03;

/**
 * Created by Andrii_Grygoruk on 9/12/2017.
 */
public class Vehicle {
    double coordinates;
    int price;
    int speed;
    int year;

    public Vehicle(double coordinates, int price, int speed, int year) {
        this.coordinates = coordinates;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public String toString(){
        return "coordinates: " + this.coordinates + "; price: " + this.price + "; speed: " + this.speed + "; year: " + this.year;
    }
}
