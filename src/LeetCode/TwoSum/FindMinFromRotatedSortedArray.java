package LeetCode.TwoSum;

import java.util.Arrays;

public class FindMinFromRotatedSortedArray {

  /*  public int[] minRotatedSorted(int nums[])
    {
        int temp = 0;
        for(int i = 0 ;i < nums.length ; i++)
        {
            for(int j = i + 1; j < nums.length ; j++)
            {
                if(nums[i] > nums[j])
                {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }*/

    //Binary Search
   /* public int minRotatedSorted(int nums[])
    {
        int start = 0;
        int end = nums.length - 1;

        while(start < end) {
           int mid = start + (end - start) >>> 2;

            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            } else if (nums[end] > nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return nums[start];
    }*/

    public int minRotatedSorted(int nums[])
    {
        int start = 0;
        int end = nums.length - 1;

        while(start < end) {
            int mid = (start + end) / 2;

           if(nums[mid] < nums[end])
           {
               end = mid;
           }
           else {
               start = mid + 1;
           }
        }
        return nums[start];
    }

    public static void main(String a[])
    {
        FindMinFromRotatedSortedArray findMinFromRotatedSortedArray = new FindMinFromRotatedSortedArray();

     //   int[] nums = {11,13,14,15};

        int[] nums = {4,5,6,7,0,1,2};

        //int[] minNumber = findMinFromRotatedSortedArray.minRotatedSorted(nums);
        int minNumber = findMinFromRotatedSortedArray.minRotatedSorted(nums);
        System.out.println("Minimum number ===" + minNumber);

        int high = 2100000000;
        int low = 2000000000;
        System.out.println("mid using >>> 1 = " + ((low + high) >>> 1));
        System.out.println("mid using / 2   = " + ((low + high) / 2));
        //Arrays.binarySearch()
    }
}
