package LeetCode.slidingWindow;

import DSA.Arrays.Array;

public class SlidingWindow {

    public double slidingMethod(int[] nums, int k)
    {
        Double[] sumAverage = new Double[nums.length - k +1];

        int start = 0;
        double sum = 0;
        for (int i = 0; i<nums.length; i++)
        {
            sum = sum + nums[i];

            if(i <= k)
            sumAverage[start] = (sum/2);
            start++;

        }

        return 0.0;
    }
    public static void main(String[] arg)
    {
        SlidingWindow window = new SlidingWindow();
        int[] nums = {1,4,5,6};
        double finalOutput = window.slidingMethod(nums, 2);

        System.out.println("final out put "+ finalOutput);

    }
}
