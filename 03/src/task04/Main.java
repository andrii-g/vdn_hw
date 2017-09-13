package task04;

import java.util.Scanner;

/**
 * Created by Andrii_Grygoruk on 9/12/2017.
 */
public class Main {
    public static void main(String[] args) {

        DocumentWorker documentWorker;
        int userStatusCode = NumberProcessor.getUserStatusCode();

        if (userStatusCode == 1){
            documentWorker = new ProDocumentWorker();
        } else if(userStatusCode == 2){
            documentWorker = new ExpertDocumentWorker();
        }else if(userStatusCode == 3){
            documentWorker = new DocumentWorker();
        }else {
            return;
        }
        documentWorker.printInfo();
    }
}

class NumberProcessor{
    static int getUserStatusCode(){
        System.out.println("Enter the key");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        int userInputInt = Integer.parseInt(userInput);
        int prokey = 123;
        int expertKey = 124;
        if (userInputInt == prokey){
            return 1;
        }else if(userInputInt == expertKey){
            return 2;
        }else {
            return 3;
        }
    }
}

//Задание 4
//        Используя IntelliJ IDEA, создайте проект.
//        Требуется:
//        Создайте класс DocumentWorker.
//        В теле класса создайте три метода openDocument(), editDocument(), saveDocument().
//        В тело каждого из методов добавьте вывод на экран соответствующих строк:
// "Документ открыт", "Редактирование документа доступно в версии Про", "Сохранение документа доступно в версии Про".
//        Создайте производный класс ProDocumentWorker.
//        Переопределите соответствующие методы, при переопределении методов выводите следующие строки:
// "Документ отредактирован", "Документ сохранен в старом формате, сохранение в остальных форматах доступно в версии Эксперт".
//        Создайте производный класс ExpertDocumentWorker от базового класса ProDocumentWorker.
// Переопределите соответствующий метод. При вызове данного метода необходимо выводить на экран "Документ сохранен в новом формате".
//        В теле метода main() реализуйте возможность приема от пользователя номера ключа доступа pro и exp.
// Если пользователь не вводит ключ, он может пользоваться только бесплатной версией (создается экземпляр базового класса),
// если пользователь ввел номера ключа доступа pro и exp, то должен создаться экземпляр соответствующей версии класса,
// приведенный к базовому – DocumentWorker.
