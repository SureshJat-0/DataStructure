package List;

import java.util.LinkedList;

public class Linked_List_CF {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");

        list.addLast("Link");
        list.add("List"); // Both addLast and add are same 
        System.out.println(list);

        list.removeFirst();
        list.remove(); // Both removeFirst and remove are same 
        list.removeLast();
        System.out.println(list);
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");
        
    }
}
