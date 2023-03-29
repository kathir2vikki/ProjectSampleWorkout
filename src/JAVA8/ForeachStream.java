package JAVA8;

import java.util.ArrayList;
import java.util.List;

public class ForeachStream {

    public  static void main (String a[])
    {
        List<String> list = new ArrayList<>();

        list.add("kathir");
        list.add("vikki");

        list.stream().forEach(System.out::println);
    }
}
