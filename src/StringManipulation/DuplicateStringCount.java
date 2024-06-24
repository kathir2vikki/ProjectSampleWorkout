package StringManipulation;

import DSA.Arrays.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateStringCount {


    public static void stringCount()
    {
        String s2 = "hello world how are hello world how";

        String[] s3 = s2.split(" ");

        Map<String , Integer> map = new HashMap<>();

        for(String s4 : s3)
        {
            if(map.containsKey(s4))
            {
                map.put(s4,map.get(s4) + 1);
            }
            else {
                map.put(s4, 1);
            }
        }

        map.forEach((k,v) -> System.out.println("key ==== " + k + "value === " +v));
     }

    public static void main(String[] a)
    {
        DuplicateStringCount.stringCount();

        String s1 = "hello world how are hello world";

        System.out.println(Arrays.stream(s1.split(" ")).collect(Collectors.groupingBy(s -> s, Collectors.counting())));

    }
}
