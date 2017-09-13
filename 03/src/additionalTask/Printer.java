package additionalTask;

/**
 * Created by Andrii_Grygoruk on 9/12/2017.
 */
public class Printer {
    void print(String value){
        String className = this.getClass().getSimpleName();
        System.out.println(className);
        System.out.println(className == "Printer");

        if (className == "Printer"){
            System.out.println(value + "!");
            System.out.println("----");
        }else {
            System.out.println((char)27 + "[32m" + value + (char)27 + "[37m");
            System.out.println("----");
        }
    }
}
