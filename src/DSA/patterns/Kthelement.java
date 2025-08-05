package DSA.patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Kthelement {


    public static void main(String[] z)
    {
        int[] nums = {7,4,5,8,1};
        int target = 3;

        List<Integer> kthElement = findTheKthLargestElement(target, nums);

        kthElement.stream().forEach(System.out::println);

    }

    static List<Integer> findTheKthLargestElement(int tar, int[] nums)
    {
        PriorityQueue priorityQueue = new PriorityQueue();

        for(int num : nums)
        {
            priorityQueue.offer(num);

            if(priorityQueue.size() > tar)
            {
                priorityQueue.poll();
            }
        }
        return new ArrayList<>(priorityQueue);
    }

}
