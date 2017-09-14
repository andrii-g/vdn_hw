package task03;

/**
 * Created by Andrii_Grygoruk on 9/14/2017.
 */
public class Distance {
    static double distance;

    static void print(){
        System.out.println("In m: " + distance);
    }

    static class Converter{
        static void mToKm(){
            System.out.println("In km: " + distance / 1000);
        }
    }
}
