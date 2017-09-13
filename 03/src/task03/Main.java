package task03;

/**
 * Created by Andrii_Grygoruk on 9/12/2017.
 */
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(100500, 500, 100, 1980);
        Vehicle plane = new Plane(100500, 500, 100, 1980, 9000, 180);
        Vehicle car = new Car(100500, 500, 100, 1980);
        Vehicle ship = new Ship(100500, 500, 100, 1980, 4500, "Odessa");

        System.out.println(vehicle);
        System.out.println(plane);
        System.out.println(car);
        System.out.println(ship);
    }
}

//Задание 3
//Используя IntelliJ IDEA, создайте проект.
//Требуется:
//Создать класс Vehicle.
//В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год выпуска).
//Создайте 3 производных класса Plane, Саг и Ship.
//Для класса Plane должна быть определена высота и количество пассажиров.
//Для класса Ship – количество пассажиров и порт приписки.
//Написать программу, которая выводит на экран информацию о каждом средстве передвижения.
