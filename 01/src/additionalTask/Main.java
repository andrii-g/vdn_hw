package additionalTask;

/**
 * Created by Андрей on 10.09.2017.
 */
public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        address.setApartment("app 1");
        address.setCity("city 1");
        address.setCountry("country 1");
        address.setHouse("house 1");
        address.setApartment("appartment 1");
        address.setIndex("index 1");
        address.setStreet("street 1");

        System.out.println(address.getApartment() + " " + address.getCity() + " " + address.getCountry() +
            " " + address.getHouse() + " " + address.getApartment() + " " + address.getIndex() + " " + address.getStreet());
    }
}


// Задание Используя IDEA, создайте проект c пакетом.
// Требуется: Создать класс с именем Address.
// В теле класса требуется создать поля: index, country, city, street, house, apartment.
// Для каждого поля, создать метод с двумя методами доступа (get, set)
// Создать экземпляр класса Address.
// В поля экземпляра записать информацию о почтовом адресе.
// Выведите на экран значения полей, описывающих адрес.