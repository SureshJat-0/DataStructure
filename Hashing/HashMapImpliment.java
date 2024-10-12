import java.util.LinkedList;
import java.util.ArrayList;

public class HashMapImpliment {

    static class HashMap<k, v> { // generics

        // Nodes for the LinkedList
        class Node {
            k key;
            v val;
            Node(k key, v val) {
                this.key = key;
                this.val = val;
            }
        }

        // Variables
        private int n; // n - Number of Nodes in LinkedList
        private int N; // N - Number of Buckets
        private LinkedList<Node> buckets[];

        // Constructor for the HashMap class
        @SuppressWarnings("unchecked")
        HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[N];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        public int hashFunction(k key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N; // 0 <= bi < N
        }
        public int searchInLL(k key, int bi) {
            LinkedList<Node> ll = buckets[bi];

            for (int di = 0; di < ll.size(); di++) {
                if (ll.get(di).key == key) {
                    return di;
                }
            }
            return -1;
        }
        @SuppressWarnings("unchecked")
        public void rehashing() {
            LinkedList<Node> oldBuckets[] = buckets;
            buckets = new LinkedList[N*2];
            
            for (int i = 0; i < N*2; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (int i = 0; i < oldBuckets.length; i++) {
                LinkedList<Node> ll = new LinkedList<>();
                for (int j = 0; j < oldBuckets[i].size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.val);
                }
            }
        }

        // Put
        public void put(k key, v val) {
            /*
                step 1 : Find Bucket Index
                step 2 : Search in LinkedList of Bucket index for val & return Data index
                step 3 : Add or Update the given Val
                step 4 : Check for Lamda ( n / N )
                step 5 : if Lamda > k : Rehashing
             */

            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            
            if (di == -1) { // key does not exist
                buckets[bi].add(new Node(key, val));
                n++;
            } else { // key exist
                buckets[bi].get(di).val = val;
            }

            double lamda = (double) n / N;
            if (lamda > 2.0) {
                rehashing();
            }
            
        }

        // get
        public v get(k key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) {
                System.out.println("Not exist");
                return null;
            } else {
                Node node = buckets[bi].get(di);
                return node.val;
            }
        }

        // Contains
        public boolean containsKey(k key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            
            if (di == -1) {
                return false;
            } else {
                return true;
            }
        }

        // remove
        public v remove(k key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if (di == -1) { // key not exist
                return null; 
            } else { // key exist
                Node node = buckets[bi].get(di);
                buckets[bi].remove(di);
                n--;
                return node.val;
            }
        }

        // isEmpty
        public boolean isEmpty() {
            return n == 0;
        }

        // keySet
        public ArrayList<k> keySet() {
            ArrayList<k> keys = new ArrayList<>();

            for (int bi = 0; bi < buckets.length; bi++) {
                for (int di = 0; di < buckets[bi].size(); di++) {
                    Node node = buckets[bi].get(di);
                    keys.add(node.key);
                }
            }

            return keys;
        }
    }
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // put
        map.put("India", 140);
        map.put("US", 90);
        map.put("China", 150);
        
        // contains
        System.out.println(map.containsKey("India"));

        // get
        System.out.println(map.get("US"));

        // remove
        System.out.println(map.remove("China"));

        // isEmpty
        System.out.println(map.isEmpty());
        System.out.println();

        // keySet
        ArrayList<String> keys = map.keySet();
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + " : " + map.get(keys.get(i)));
        }
        
    }
}
