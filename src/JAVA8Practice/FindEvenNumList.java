package JAVA8Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumList {


    public static void main (String[] h)
    {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);


        List<Integer> evenList = list.stream().filter(g -> g%2==0).collect(Collectors.toList());

        evenList.forEach(System.out::println);
    }

}
