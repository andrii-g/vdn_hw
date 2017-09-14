package additionalTask;

/**
 * Created by Andrii_Grygoruk on 9/14/2017.
 */
public class Calculator {
    static void add(int a, int b){
        System.out.println("add: " + (a + b));
    }

    static void minus(int a, int b){
        System.out.println("add: " + (a - b));
    }

    static class Printer{
        static void print(int a, int b){
            add(a, b);
            minus(a, b);
        }
    }
}

class Main{
    public static void main(String[] args) {
        Calculator.Printer.print(10, 20);
    }
}