package task02;

import java.util.ArrayList;

/**
 * Created by Andrii_Grygoruk on 9/13/2017.
 */
public class Zoo {
    ArrayList<String> arrayList = new ArrayList<>();

    void add(){
        arrayList.add("elephnt");
        arrayList.add("shark");
        arrayList.add("penguin");
        arrayList.add("cat");
        arrayList.add("dog");
        arrayList.add("lion");
        arrayList.add("tiger");
        arrayList.add("mouse");
    }

    void show(){
        for (String s: this.arrayList) {
            System.out.println(s);
        }
    }
}
