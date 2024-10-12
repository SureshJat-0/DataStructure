// Question : Majority element of the Array

import java.util.HashMap;
import java.util.Map;

public class MajorityEle {

    // Adding elements in the Map
    public static void findMajEle(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        // Check for majority elements
        for (Map.Entry<Integer,Integer> ele : map.entrySet()) {
            if (ele.getValue() > nums.length / 3) {
                System.out.print(ele.getKey() + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        findMajEle(nums);
    }
}
