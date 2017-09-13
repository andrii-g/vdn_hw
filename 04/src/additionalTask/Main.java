package additionalTask;

/**
 * Created by Andrii_Grygoruk on 9/13/2017.
 */
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw();
        rectangle.draw();
    }
}

//Задание
//        Используя IntelliJ IDEA, создайте проект. Требуется:
//        Создать абстрактный Shape, в котором содержится один абстрактный метод void draw().
//        Создайте 2 производных класса Circle, Rectangle, которые реализую метод void draw()
// и выводят свои сообщение – “Круг”, “Прямоугольник”.
//        В классе Main создать объекты классов Circle,
// Rectangle через родительский класс( полиморфная ссылка) и вызвать их методы
