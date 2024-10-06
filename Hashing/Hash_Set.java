import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {
    public static void main(String[] args) {
        // Creating
        HashSet<Integer> set = new HashSet<>();

        // Inserting
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1); // Set does not Contains Duplicates. 1 is added only once
        
        // Size
        int size = set.size();
        System.out.println(size);

        // Print All element of Set
        System.out.println(set);
        
        // Contains
        if (set.contains(1)) {
            System.out.println("Set contains 1");
        }
        if (!set.contains(5)) {
            System.out.println("Set does not contains 5");
        }

        // Remove 
        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("1 is removed");
        }
        System.out.println();

        // Iterator
        Iterator It = set.iterator();

        while (It.hasNext()) { // It makes no guarantees as to the iteration order of the set
            System.out.println(It.next());
        }

    }
}