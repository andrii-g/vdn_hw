package task03;

/**
 * Created by Andrii_Grygoruk on 9/14/2017.
 */
public class Main {
    public static void main(String[] args) {
        Distance.distance = 8500;
        Distance.print();
        Distance.Converter.mToKm();
    }
}

//Задание 3
//        Создайте проект, используя IntelliJ IDEA.
//        Требуется:
//        Создать класс Distance с полем distance типа double и методом print.
// В классе Distance, создайте статический класс Converter с методами, которые будут
// конвертировать расстояние в разные единицы измерения (к примеру, из метров в километры,
// из километров в мили, и так далее).
