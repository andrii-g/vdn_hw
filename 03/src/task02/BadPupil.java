package task02;

/**
 * Created by Andrii_Grygoruk on 9/12/2017.
 */
public class BadPupil extends Pupil {
    @Override
    protected void study(){
        System.out.println("Study like a bad pupil");
    }

    @Override
    protected void read(){
        System.out.println("Read like a bad pupil");
    }

    @Override
    protected void write(){
        System.out.println("Write like a bad pupil");
    }

    @Override
    protected void relax(){
        System.out.println("Relax like a bad pupil");
    }
}