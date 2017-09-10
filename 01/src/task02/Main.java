package task02;

/**
 * Created by Андрей on 10.09.2017.
 */
public class Main {
    public static void main(String[] args) {
        double side1;
        double side2;
        double area;
        double perimeter;
        TakeNumbers takeNumbers = new TakeNumbers();
        Rectangle rectangle = new Rectangle();

        System.out.println("Let's calculate area and perimeter of rectangle: ");
        side1 = takeNumbers.getSide1();
        side2 = takeNumbers.getSide2();
        area = rectangle.areaCalculator(side1, side2);
        perimeter= rectangle.perimeterCalculator(side1, side2);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

    }
}


//Задание 2
// Используя IDEA, создайте проект c пакетом. Требуется: Создать класс с именем Rectangle.
// В теле класса создать два поля, описывающие длины сторон double side1, double side2.
// Создать два метода, вычисляющие площадь прямоугольника – double areaCalculator (double side1, double side2)
// и периметр прямоугольника – double perimeterCalculator (double side1, double side2).
// Написать программу, которая принимает от пользователя длины двух сторон прямоугольника и выводит на экран периметр и площадь.