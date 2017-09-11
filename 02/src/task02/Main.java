package task02;

/**
 * Created by Andrii_Grygoruk on 9/11/2017.
 */
public class Main {
    public static void main(String[] args) {
        Car zhiguli = new Car();
        Car ford = new Car(1901);
        Car ferrari = new Car(2017, "red");

        System.out.println(zhiguli.getYear() + " " + zhiguli.getColour());
        System.out.println(ford.getYear() + " " + ford.getColour());
        System.out.println(ferrari.getYear() + " " + ferrari.getColour());
    }
}

//Задание 2
//        Используя Intelij IDEA создать проект, пакет.
//        Создать класс Машина с полями год(int), цвет(String).
//        Создать конструктор по умолчанию, конструктор с одним и 2-я параметрами.
//        Создать класс Main в котором создать экземпляры вызывая разные конструкторы.
