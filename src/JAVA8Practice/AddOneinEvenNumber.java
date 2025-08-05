package JAVA8Practice;

import java.util.Arrays;
import java.util.List;

public class AddOneinEvenNumber {

    public static void main(String[] as)
    {
        List<Integer> ls = Arrays.asList(1,2, 3,4,5);

        ls.stream().map(a -> (a % 2 == 0) ? a+1 : a ).forEach(System.out::println);


    }
}
