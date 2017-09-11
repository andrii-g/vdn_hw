package task04;


/**
 * Created by Andrii_Grygoruk on 9/11/2017.
 */
public class Main {
    public static void main(String[] args) {
        Car zhiguli = new Car();
        Car ford = new Car(1955);
        Car lamborghini = new Car(2016, 350.55);
        Car nissan = new Car(2003, 230, 1555);
        Car ferrari = new Car(2017, 340, 1201, "red");

        System.out.println(zhiguli);
        System.out.println(ford);
        System.out.println(lamborghini);
        System.out.println(nissan);
        System.out.println(ferrari);
    }
}


//Задание 4
//        Используя Intelij IDEA создать проект, пакет.
//        (Заново!) Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
//        Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
//        Перегрузить конструкторы вызывая конструктор из конструктора.
//        Создать класс Main, в котором создать экземляры класса Машина с разными параметрами.