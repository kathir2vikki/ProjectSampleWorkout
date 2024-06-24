package LeetCode.TwoSum;

import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    // o(n2)
    /*public int[] twoSum(int[] nums, int target) {
        int[] k = new int[nums.length];
        for(int i = 0; i<nums.length;i++)
        {
            for(int j = i+1;j<nums.length;j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    k[0] = i;
                    k[1] = j;
                    return k;
                }
            }
        }
        return k;
    }*/

    //o(n)

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> twoSumMap = new HashMap<>();

        for(int i = 0; i< nums.length; i++)
        {
            int complement = target - nums[i];

            if(twoSumMap.containsKey(complement))
            {
                return new int[] {twoSumMap.get(complement), i};
            }
            twoSumMap.put(nums[i],i);
        }
     return new int[]{};
    }

    public static void main(String[] a)
    {
        TwoSum sum = new TwoSum();
        int[] nums = {5,3,1};
        int target = 8;
        int[] indexses = sum.twoSum(nums, target);
        System.out.println("final value   = " + indexses[0] +"    === " + indexses[1]);
        int i = 1- 10;
        System.out.println(i);
    }
}
