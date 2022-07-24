import java.util.*;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Adding new element to the list
        list.add(1);
        list.add(25);
        list.add(30);
        list.add(3);
        list.add(325);
        list.add(100);
        Collections.sort(list);
        // Using iterator and deleting some element from the list
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            Integer i = itr.next();
            if (i < 20) {
                itr.remove();
            }
        }
        // Printing the list
        System.out.println(list);
    }
}
