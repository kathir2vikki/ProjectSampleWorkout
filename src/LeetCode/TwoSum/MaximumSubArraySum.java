package LeetCode.TwoSum;

import LeetCode.Utils.Utils;

public class MaximumSubArraySum {

   /* public int [] maxSubArray(int[] nums)
    {
      int soFarMax = Integer.MIN_VALUE;
      int currentSum = 0;
      int start = 0;
      int s = 0;
      int end = 0;


      for(int i = 0; i <nums.length ; i++)
      {
          currentSum = currentSum + nums[i];
          if(soFarMax < currentSum)
          {
              soFarMax = currentSum;
              start = s;
              end = i;
          }

          if(currentSum < 0)
          {
              s = 1 + i;
              currentSum = 0;
          }
      }
        int[] finalSumOfArray = new int[nums.length];
      System.out.println("soFarMax" + soFarMax);
      int p = 0;
      for (int j = start ; j<=end; j++)
      {
          finalSumOfArray[p] = nums[j];
          p++;
      }
return finalSumOfArray;

    }*/


    //kadane's Algorithm

    private int maxSubArray(int[] nums) {

        int result = nums[0];
        int maxArray = nums[0];

        for(int i = 1; i<nums.length;i++)
        {
            maxArray = Math.max(maxArray + nums[i], nums[i]);
            result = Math.max(maxArray, result);
        }
        return result;

    }

    public static void main(String[] a )
    {
        MaximumSubArraySum maximumSubArray = new MaximumSubArraySum();

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

       // int[] finalSubArray = maximumSubArray.maxSubArray(nums);

        // Utils.printArray(finalSum);

        int finalSum = maximumSubArray.maxSubArray(nums);

        System.out.println("finalSum ===" + finalSum);

    }

}
