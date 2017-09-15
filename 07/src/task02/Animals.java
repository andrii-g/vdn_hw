package task02;

/**
 * Created by Andrii_Grygoruk on 9/15/2017.
 */
public enum Animals {
    ANIMAL1(10), ANIMAL2(15);
    int age;
    Animals(int age) {
        this.age = age;
    }

    public String toString(){
        return this.name() + ", year: " + this.age;
    }
}
