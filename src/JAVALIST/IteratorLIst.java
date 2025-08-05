package JAVALIST;

import java.util.ArrayList;
import java.util.List;

public class IteratorLIst {
    

    public static void main(String[] a )
    {
        List<String> ls = new ArrayList<>();
        ls.add("kathir");
        ls.add("vikki");


        for(String list : ls)
        {
            System.out.println("asdasd ====" + list);
        }
    }
}
