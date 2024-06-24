package LeetCode.TwoSum;

public class FindTargetFromRotatedSortedArray {

    public int findTarget(int[] nums, int key)
    {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end)
        {
            int mid = (start+end)/2;

            if(nums[mid] == key)
                return mid;

            if(nums[start] <= nums[mid])
            {
                if(nums[start] <= key && key <= nums[mid])
                {
                    end = mid-1;

                }
                else {
                    start = mid + 1;
                }
            }
            if(nums[mid] <= nums[end])
            {
                if(nums[mid] <= key && key <= nums[end])
                {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }

    public static void main(String a[])
    {
        FindTargetFromRotatedSortedArray findTargetFromRotatedSortedArray = new FindTargetFromRotatedSortedArray();

        int[] nums = {4,5,6,7,0,1,2};

        int key = 0;

        int finalValue = findTargetFromRotatedSortedArray.findTarget(nums, key);

        System.out.println("Target value is there ==== " + finalValue);
    }
}
