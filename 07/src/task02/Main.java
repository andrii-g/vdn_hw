package task02;

/**
 * Created by Andrii_Grygoruk on 9/15/2017.
 */
public class Main {
    public static void main(String[] args) {
        Animals animals = Animals.ANIMAL1;

        System.out.println(animals);
    }
}

// Задание 2
// Создайте проект, используя IntelliJ IDEA.
//
// Создайте перечислительный тип (enum) Animals, содержащий конструктор, который должен принимать целочисленное
// значение (возраст животного), и содержать перегруженный метод toString(),
// который должен возвращать название экземпляра и возраст животного.