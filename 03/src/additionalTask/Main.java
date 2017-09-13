package additionalTask;

/**
 * Created by Andrii_Grygoruk on 9/12/2017.
 */
public class Main {
    public static void main(String[] args) {
        Printer newPrinter = new NewPrinter();
        Printer printer = new Printer();
//        newPrinter.print("new printer");
        printer.print("printer");
    }
}

// Задание
// Используя IntelliJ IDEA, создайте проект.
// Требуется:
// Создайте класс Printer.
// В теле класса создайте метод void print(String value), который выводит на экран значение аргумента.
// Реализуйте возможность того, чтобы в случае наследования от данного класса других классов,
// и вызове соответствующего метода их экземпляра, строки, переданные в качестве аргументов методов, выводились разными цветами.
// Обязательно используйте приведение типов.