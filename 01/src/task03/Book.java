package task03;

/**
 * Created by Андрей on 10.09.2017.
 */
public class Book {
    Author author = new Author();
    Title title = new Title();
    Content content = new Content();

    void setBook(String author, String title, String content){
        this.author.setAuthor(author);
        this.title.setTitle(title);
        this.content.setContent(content);
    }

    void show(){
        author.show();
        title.show();
        content.show();
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.setBook("Sir A. Conan Doyle", "Adventures of Sherlock Holmes", "Detective");
        book.show();
    }
}

//Задание 3
//Используя IDEA,создайте проект c пакетом.
//Требуется:Создать класс Book(Main).
// Создать классы Title,Author и Content,каждый из которых должен
// содержать одно строковое поле и метод void show().
// Реализуйте возможность добавления в книгу названия книги,
// имени автора и содержания.Выведите на экран при помощи метода
// show()название книги,имя автора и Содержание.