package additionalTask;

/**
 * Created by Andrii_Grygoruk on 9/15/2017.
 */
public class Main {
    public static void main(String[] args) {
        Vehicles vehicles = Vehicles.CAR;

        System.out.println(vehicles);
    }
}

//Задание
//
// Создайте проект, используя IntelliJ IDEA.
//
// Создайте перечислительный тип (enum) Vehicles,
// содержащий конструктор, который должен принимать целочисленное значение
// (стоимость автомобиля), содержать метод getColor(), который возвращает строку
// с цветом автомобиля, и содержать перегруженный метод toString(), который
// должен возвращать строку с названием экземпляра, цветом и  стоимостью автомобиля.
