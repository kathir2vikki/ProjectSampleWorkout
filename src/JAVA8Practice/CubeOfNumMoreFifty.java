package JAVA8Practice;

import java.util.Arrays;
import java.util.List;

public class CubeOfNumMoreFifty {


    public static void main(String[] a)
    {
        List<Integer> list = Arrays.asList(1,5,2,3,8);

        list.stream().map(z -> z*z*z)
                .filter(c -> c>50)
                .forEach(System.out::println);
    }
}
