package task03;

/**
 * Created by Andrii_Grygoruk on 9/13/2017.
 */
public class Player implements Playable, Recordable {
    @Override
    public void play() {
        System.out.println("play");
    }

    @Override
    public void record() {
        System.out.println("record");
    }

    @Override
    public void pause() {
        System.out.println("pause");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }
}
