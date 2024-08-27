package List;

import java.util.Collections;
import java.util.ArrayList;

public class ArrayLists {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        // Add element
        list.add(2);
        list.add(4);
        list.add(7);

        System.out.println(list);

        // Get element
        System.out.println(list.get(0));

        // Add element in between 
        list.add(1, 9);
        System.out.println(list);

        // Set element
        list.set(0, 1);
        System.out.println(list);

        // Delet element
        list.remove(2);
        System.out.println(list);

        // Size
        int size = list.size();
        System.out.println(size);

        // Loops
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Sorting 
        Collections.sort(list);
        System.out.println(list);

    }
}
