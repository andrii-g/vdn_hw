package task04;

/**
 * Created by Андрей on 10.09.2017.
 */
public class Computer {
    String detail;

    public static void main(String[] args) {
        Computer[] computers = new Computer[5];
        computers[0] = new Computer();
        computers[1] = new Computer();
        computers[2] = new Computer();
        computers[3] = new Computer();
        computers[4]= new Computer();

        for (int i = 0; i < 5; i++) {
            computers[i].detail = "Detail #" + i;
        }

        for(Computer comp : computers){
            System.out.println("Detail is: " + comp.detail);
        }
    }
}

//Задание 4
//Используя IDEA, создайте проект с пакетом. Создать класс Computer,
// создать массив объектов Computers размером 5.
// Далее руками создать 5 экземпляров этого класса и записать в компьютер (используя loop)
