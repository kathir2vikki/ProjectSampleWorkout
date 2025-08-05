package LeetCode.TwoSum;

public class MaximumSubArrayProduct {


    public int maxProductSubArray(int[] nums)
    {

        int maxProd = 1;
        int soFarProd = nums[0];

        for(int i = 0 ; i<nums.length; i++)
        {
           // nums[i] = nums[i] * -1;
            maxProd = maxProd * nums[i];

            soFarProd = Math.max(soFarProd, maxProd);


        }
        System.out.println("maxProd === " + maxProd);
        System.out.println("maxProd === " + soFarProd);
        maxProd = 1;
        for(int i = nums.length-1 ; i >= 0; i--)
        {
            maxProd = maxProd * nums[i];

            soFarProd = Math.max(soFarProd, maxProd);


        }
        return soFarProd;
    }

    public static void main (String[] b)
    {
        MaximumSubArrayProduct maxProductSubArray = new MaximumSubArrayProduct();

        int[] nums = {2,3,-2,4};

       // int[] nums = {-3,-1,-1};

        // int[] nums = {-2};

        int finalProduct = maxProductSubArray.maxProductSubArray(nums);

        System.out.println("finalProduct ==" + finalProduct);
    }
}
