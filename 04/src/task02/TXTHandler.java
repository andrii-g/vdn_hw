package task02;

/**
 * Created by Andrii_Grygoruk on 9/12/2017.
 */
public class TXTHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("TXT open");
    }

    @Override
    void create() {
        System.out.println("TXT create");
    }

    @Override
    void change() {
        System.out.println("TXT change");
    }

    @Override
    void save() {
        System.out.println("TXT save");
    }
}
