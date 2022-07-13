package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(25);
        list.add(30);
        list.add(3);
        list.add(35);
        list.add(40);
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            Integer i = itr.next();
            if (i < 20) {
                itr.remove();
            }
        }
        System.out.println(list);
    }
}
