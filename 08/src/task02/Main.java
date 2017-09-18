package task02;

import java.util.Scanner;

/**
 * Created by Andrii_Grygoruk on 9/18/2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Worker[] workers = new Worker[5];
        int experience = 10;
        int currentYear = 2017;

        for (int i = 0; i < workers.length; i++) {
            System.out.println("Enter data about " + (i+1) + " worker:");
            workers[i] = new Worker();

            System.out.println("Enter name:");
            String name = scanner.nextLine();
            workers[i].setName(name);

            System.out.println("Enter position:");
            String position = scanner.nextLine();
            workers[i].setPosition(position);

            System.out.println("Enter year:");
            try {
                int year = scanner.nextInt();
                workers[i].setYear(year);

                try{
                    if (workers[i].getYear() < 1900 || workers[i].getYear() > 2017){
                        throw new MyException();
                    }
                    if ((currentYear - workers[i].getYear()) >= experience){
                        System.out.println("Worker's " + workers[i].getName() + " experience is more than " + experience + ", his experience started at: " + workers[i].getYear());
                    }
                }catch (MyException e){
                    System.out.println(e.getMessage());
                }
            }catch(Exception e){
                System.out.println("Exception occured");
                System.out.println(e.toString());
            }

        }
    }
}

//Задание 2
//        Создайте проект, используя IntelliJ IDEA.
//        Требуется:
//        Описать класс с именем Worker, содержащую следующие поля:
//        · фамилия и инициалы работника;
//        · название занимаемой должности;
//        · год поступления на работу.
//        Написать программу, выполняющую следующие действия:
//        · ввод с клавиатуры данных в массив, состоящий из пяти элементов типа Worker (записи должны быть упорядочены по алфавиту);
//        · если значение года введено не в соответствующем формате выдает исключение.
//        · вывод на экран фамилии работника, стаж работы которого превышает введенное значение.
