package task02;

/**
 * Created by Andrii_Grygoruk on 9/13/2017.
 */
public class Main {
    public static void main(String[] args) {
        AbstractHandler[] array = new AbstractHandler[3];
        AbstractHandler xml = new XMLHandler();
        AbstractHandler txt = new TXTHandler();
        AbstractHandler doc = new DOCHandler();

        array[0] = xml;
        array[1] = txt;
        array[2] = doc;

        for (int i = 0; i < array.length; i++) {
            array[i].open();
            array[i].create();
            array[i].change();
            array[i].save();
            System.out.println("--------");
        }
    }
}

//Задание 2
//        Используя IntelliJ IDEA, создайте проект. Требуется:
//        Создайте абстрактный класс AbstractHandler.
//        В теле класса создать абстрактные методы void open(), void create(), void change(), void save().
//        Создать производные классы XMLHandler, TXTHandler, DOCHandler от базового класса AbstractHandler.
//        Написать программу, которая будет выполнять определение документа и для каждого формата должны быть
// методы открытия, создания, редактирования, сохранения определенного формата документа.
