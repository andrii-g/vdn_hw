package additionalTask;

/**
 * Created by Andrii_Grygoruk on 9/15/2017.
 */
public enum Vehicles {
    CAR(10, "Black"), BUS(50, "Orange"), PLANE(100500, "Green");

    int price;
    String color;

    Vehicles(int price, String color){
        this.price = price;
        this.color = color;
    }

    String getColor(){
        return color;
    }

    @Override
    public String toString(){
        return this.name() + ", " + this.getColor() + ", " + this.price;
    }
}
