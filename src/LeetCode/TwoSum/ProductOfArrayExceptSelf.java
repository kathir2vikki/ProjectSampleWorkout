package LeetCode.TwoSum;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

   /* public int[] productOfArray(int[] nums)
    {

        int[] finalArray = new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            finalArray[i] = getProductValue(nums, 0, i) * getProductValue(nums, i+1, nums.length);
        }
        return finalArray;
    }

    private int getProductValue(int[] nums, int startIndex, int endIndex) {
        int finalInt = 1;
        for (int k = startIndex; k < endIndex; k++) {
             finalInt = finalInt * nums[k] ;
        }
        return finalInt;
    }*/


  /*  public int[] productOfArray(int[] nums)
    {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] res = new int[nums.length];

        left[0] = 1;

        for(int i = 1; i<nums.length; i++)
        {
            left[i] = left[i-1] * nums[i-1];
        }

        right[nums.length-1] = 1;

        for(int j = nums.length-2; j >= 0 ; j--)
        {
            right[j] = right[j+1] * nums[j+1];
        }

        for(int k = 0; k<nums.length; k++)
        {
            res[k] = left[k] * right [k];
        }

        return res;
    }*/


    /*
        2       3       4       5

        1       2      2*3    4*3*2   left
      3*4*5    4*5      5       1     right

     */
    private int[] productOfArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[nums.length];

        int left = 1;

        for(int i = 0; i<n; i++)
        {
            if(i>0)
            {
                left = left * nums[i-1];
            }
            res[i] = left;
            System.out.println("Left result ===  " + res[i] );
        }

        int right = 1;

        for(int i = n-1; i >= 0; i--)
        {
            if(i < n-1)
            {
                right = right * nums[i+1];
            }
            res[i] *= right;

        }


        return res;

    }

    public static void main (String a[])
    {
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        int nums[] = {2,3,4,5};
        int[] finalProductArray = productOfArrayExceptSelf.productOfArray(nums);

        Arrays.stream(finalProductArray).forEach(System.out::println);


    }


}
