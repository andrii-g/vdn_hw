package task02;

/**
 * Created by Андрей on 10.09.2017.
 */
public class Rectangle {
    double side1;
    double side2;

    double areaCalculator (double side1, double side2){
        return side1 * side2;
    }

    double perimeterCalculator (double side1, double side2){
        return 2 * (side1 + side2);
    }
}
