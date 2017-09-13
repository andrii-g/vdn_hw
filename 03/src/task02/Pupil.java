package task02;

/**
 * Created by Andrii_Grygoruk on 9/12/2017.
 */
public class Pupil {
    protected void study(){
        System.out.println("Study like a regular pupil");
    }

    protected void read(){
        System.out.println("Read like a regular pupil");
    }

    protected void write(){
        System.out.println("Write like a regular pupil");
    }

    protected void relax(){
        System.out.println("Relax like a regular pupil");
    }

    protected void show(){
        this.study();
        this.read();
        this.write();
        this.read();
        System.out.println("------------");
    }
}
