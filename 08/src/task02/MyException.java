package task02;

/**
 * Created by Andrii_Grygoruk on 9/18/2017.
 */
public class MyException extends Exception{
    @Override
    public String getMessage() {
        return "Wrong year!";
    }
}
