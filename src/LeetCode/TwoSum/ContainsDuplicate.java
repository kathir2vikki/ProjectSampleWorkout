package LeetCode.TwoSum;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containDuplicate (int[] nums)
    {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int num : nums) {
            if (hm.containsKey(num)) {
                return true;
            } else {
                hm.put(num, num);
            }
        }
        return false;
    }


/*    public boolean containDuplicate (int[] nums)
    {
        Set<Integer> hm = new HashSet<>();

        for (int num : nums) {
            hm.add(num);
        }

        return hm.size() != nums.length;
    }*/

    public static void main(String[] a)
    {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        boolean duplicate = containsDuplicate.containDuplicate(nums);
        System.out.println("Contains Duplicate ===" + duplicate);
    }
}
