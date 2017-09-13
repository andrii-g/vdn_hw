package task02;

/**
 * Created by Andrii_Grygoruk on 9/12/2017.
 */
public class ClassRoom {

    protected ClassRoom(Pupil pupil){
        pupil.study();
        pupil.read();
        pupil.write();
        pupil.relax();
        System.out.println("------------");
    }

    protected ClassRoom(Pupil pupil1, Pupil pupil2){
        this(pupil1);
        pupil2.study();
        pupil2.read();
        pupil2.write();
        pupil2.relax();
        System.out.println("------------");
    }

    protected ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3){
        this(pupil1, pupil2);
        pupil3.study();
        pupil3.read();
        pupil3.write();
        pupil3.relax();
        System.out.println("------------");
    }
}
