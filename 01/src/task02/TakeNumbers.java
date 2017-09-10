package task02;

import java.util.Scanner;

/**
 * Created by Андрей on 10.09.2017.
 */
public class TakeNumbers {
    Scanner scanner = new Scanner(System.in);
    double side1;
    double side2;

    double getSide1(){
        System.out.println("Enter side 1");
        while (!scanner.hasNextDouble()){
            System.out.println("Enter valid decimal number!");
            scanner.next();
        }
        side1 = scanner.nextDouble();
        return side1;
    }

    double getSide2(){
        System.out.println("Enter side 2");
        while (!scanner.hasNextDouble()){
            System.out.println("Enter valid decimal number!");
            scanner.next();
        }
        side2 = scanner.nextDouble();
        return side2;
    }
}
