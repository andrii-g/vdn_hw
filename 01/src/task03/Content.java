package task03;

/**
 * Created by Андрей on 10.09.2017.
 */
public class Content {
    private String content;

    public String getContent(){
        return this.content;
    }

    public void setContent(String content){
        this.content = content;
    }

    void show(){
        System.out.println(content);
    }
}
