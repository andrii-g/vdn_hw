package task04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by Andrii_Grygoruk on 9/13/2017.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()){
            list.set(iterator.nextIndex(), list.get(iterator.nextIndex()) + 1);
            iterator.next();
        }

        System.out.println(list);
    }
}

//Задание 4
//        Используя Intelij IDEA создать проект, пакет.
//        Создать класс Main, создать список целых чисел и используя ListIterator пройтись по списку и увеличить значения на 1;
