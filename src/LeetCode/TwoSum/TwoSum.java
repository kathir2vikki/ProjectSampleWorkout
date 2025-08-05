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
//[2,7,11,15], target = 18
/*    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> twoSumMap = new HashMap<>();

        for(int i = 0; i< nums.length; i++)
        {
            int difference = target - nums[i];

            if(twoSumMap.containsKey(difference))
            {
                return new int[] {twoSumMap.get(difference), i};
            }
            twoSumMap.put(nums[i],i);
        }
     return new int[]{};
    }*/


    //Two pointer

    public int[] twoSum(int[] nums, int target )
    {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;

        for(int i = 0;i<nums.length;i++) {
            int sum = nums[left] + nums[right];
            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {

                return new int[]{left, right};
            }
        }
        return new int[]{};
    }

    public static void main(String[] a)
    {
        TwoSum sum = new TwoSum();
        int[] nums = {0,1,3,5};
        int target = 4;
        int[] indexses = sum.twoSum(nums, target);
        System.out.println("final value   = " + indexses[0] +"    === " + indexses[1]);
        int i = 1- 10;
        System.out.println(i);
    }
}
