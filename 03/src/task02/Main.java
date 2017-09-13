package task02;

/**
 * Created by Andrii_Grygoruk on 9/12/2017.
 */
public class Main {
    public static void main(String[] args) {
        Pupil pupil1, pupil2, pupil3, pupil4;
        pupil1 = new Pupil();
        pupil2 = new ExcellentPupil();
        pupil3 = new GoodPupil();
        pupil4 = new BadPupil();

        ClassRoom classRoom = new ClassRoom(pupil1, pupil2, pupil3);
        ClassRoom classRoom2 = new ClassRoom(pupil4);
    }
}

//Задание 2
// Используя IntelliJ IDEA, создайте проект. Требуется:
// Создать класс, представляющий учебный класс ClassRoom.
// Создайте класс ученик Pupil.
// В теле класса создайте методы void study(), void read(), void write(), void relax().
// Создайте 3 производных класса ExcelentPupil, GoodPupil, BadPupil от класса
// базового класса Pupil и переопределите каждый из методов, в зависимости от успеваемости ученика.
// Конструктор класса ClassRoom принимает аргументы типа Pupil, класс должен состоять из 4 учеников.
// Предусмотрите возможность того, что пользователь может передать 2 или 3 аргумента.
// Выведите информацию о том, как все ученики экземпляра класса ClassRoom умеют учиться, читать, писать, отдыхать.