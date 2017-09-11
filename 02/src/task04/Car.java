package task04;

/**
 * Created by Andrii_Grygoruk on 9/11/2017.
 */
public class Car {
    private int year;
    private double speed;
    private int weight;
    private String colour;

    Car(){
        this(2010);
    }

    Car(int year){
        this(year, 220);
    }

    Car(int year, double speed){
        this(year, speed, 1600);
    }

    Car(int year, double speed, int weight){
        this(year, speed, weight, "black");
    }

    Car(int year, double speed, int weight, String colour){
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString(){
        return this.getYear() + " " + this.getSpeed() + " " + this.getWeight() + " " + this.getColour();
    }
}
