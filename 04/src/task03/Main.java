package task03;

/**
 * Created by Andrii_Grygoruk on 9/13/2017.
 */
public class Main {
    public static void main(String[] args) {
        Playable player1 = new Player();
        Recordable player2 = new Player();
        Player player3 = new Player();

        player1.play();
        player1.pause();
        player1.stop();

        System.out.println("--------");

        player2.record();
        player2.pause();
        player2.stop();

        System.out.println("--------");

        player3.record();
        player3.pause();
        player3.stop();
        player3.play();
    }
}

//Задание 3
//        Используя IntelliJ IDEA, создайте проект. Требуется:
//        Создайте 2 интерфейса Playable и Recodable.
// В каждом из интерфейсов создайте по 3 метода void play() / void pause() / void stop() и void record() / void pause() / void stop() соответственно.
//        Создайте производный класс Player от базовых интерфейсов Playable и Recodable.
//        Написать программу, которая выполняет проигрывание и запись.
