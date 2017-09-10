package task03;

/**
 * Created by Андрей on 10.09.2017.
 */
public class Title {
    private String title;

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    void show(){
        System.out.println(title);
    }
}
