package task02;

/**
 * Created by Andrii_Grygoruk on 9/14/2017.
 */
public class Vehicle {
    void print(){
        System.out.println("Vehicle print");
    }

    public class Wheel{
        void print(){
            System.out.println("Wheel print");
        }
    }

    protected class Door{
        void print(){
            System.out.println("Door print");
        }
    }
}
