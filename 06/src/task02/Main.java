package task02;

/**
 * Created by Andrii_Grygoruk on 9/14/2017.
 */
public class Main {
    public static void main(String[] args) {
        Vehicle.Door door = new Vehicle().new Door();
        Vehicle.Wheel wheel = new Vehicle().new Wheel();

        door.print();
        wheel.print();
    }
}

//Задание 2
//        Создайте проект, используя IntelliJ IDEA.
//        Требуется:
//        Создать класс Vehicle с методом print. В классе Vehicle, создайте внутренний класс Whee
