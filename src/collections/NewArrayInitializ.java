package collections;

import java.util.ArrayList;
import java.util.List;

public class NewArrayInitializ {


    public static void main(String[] arg)
    {
        List<String> l1 = new ArrayList<>();

        l1.add("kathir");
        System.out.println(l1);
        test(l1);
        System.out.println(l1);
    }

    public static void test(List l1)
    {
        l1.add("vikki");
        l1 = new ArrayList<>();
        l1.add("abcd");
        System.out.println(l1);
    }
}
