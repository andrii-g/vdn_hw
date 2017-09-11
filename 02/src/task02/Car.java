package task02;

/**
 * Created by Andrii_Grygoruk on 9/11/2017.
 */
public class Car {
    private int year;
    private String colour;

    protected Car(){

    }

    public Car(int year){
        this.year = year;
    }

    Car(int year, String colour){
        this.year = year;
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
