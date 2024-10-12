// Questions

import java.util.HashSet;
// import java.util.Iterator;

public class UnionIntersec {
    
    // Union of two Arrays
    public static int union(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        return set.size();

        // For printing the Union elements
        // Iterator It = set.iterator();
        // while (It.hasNext()) {
        //     System.out.print(It.next() + " ");
        // }
    }

    // Intersection of two Arrays
    public static int intersection(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                count++;
                set.remove(arr2[i]);
            }
        }
        return count;

        // For printing the Intersection element 
        // Iterator It = newSet.iterator();
        // while (It.hasNext()) {
        //     System.out.print(It.next() + " ");
        // }
    }

    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 3, 9};
        System.out.println(intersection(arr1, arr2));
    }
}