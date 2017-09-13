package task03;


/**
 * Created by Andrii_Grygoruk on 9/13/2017.
 */
public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.add();
        zoo.show();

        System.out.println("------");
        zoo.delete();
        zoo.show();
    }
}

//Задание 3
//        Используя Intelij IDEA создать проект, пакет.
//        Используя класс Zoo Задания 2, удалить 3, 5, 7 животные, узнать размер списка и вывести в консоль.
