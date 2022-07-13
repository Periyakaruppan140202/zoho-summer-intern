package Collections;

import java.util.HashSet;

public class Hash_Set {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(5);
        set.add(28);
        set.add(22);
        set.add(-9);
        set.add(50);
        set.add(100);
        set.add(75);
        System.out.println(set);
    }
}
