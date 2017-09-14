package additionalTask;

import java.util.ArrayList;

/**
 * Created by Andrii_Grygoruk on 9/13/2017.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Физика");
        list.add("укр мова");
        list.add("история");
        list.add("физра");

        list.add("биология");

        System.out.println(list.indexOf("Физика"));
        System.out.println(list.indexOf("физра"));
        System.out.println(list);
    }
}

//Задание
//        Используя Intelij IDEA создать проект, пакет.
//        Создать class Main, в нем создать список, добавить учителей,
// которых вы только сможете вспомнить со школы. И получить индекс самого
// лучшего учителя и самого не очень. Вывести список в консоль.
