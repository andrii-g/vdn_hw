package task02;

/**
 * Created by Andrii_Grygoruk on 9/12/2017.
 */
public class GoodPupil extends Pupil{
    @Override
    protected void study(){
        System.out.println("Study like a good pupil");
    }

    @Override
    protected void read(){
        System.out.println("Read like a good pupil");
    }

    @Override
    protected void write(){
        System.out.println("Write like a good pupil");
    }

    @Override
    protected void relax(){
        System.out.println("Relax like a good pupil");
    }
}