package JAVA8.FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionalInterface {

    public static void main (String l[])
    {
        Consumer<String> c = (s) -> System.out.println(s);

        c.accept("kathir");

       Consumer<List<Integer>> lists = list -> list.stream().forEach(a -> System.out.println(a));

       lists.accept(Arrays.asList(1,2,3));

       Consumer<List<Integer>> listConsumer = list -> {
           for(int i = 0;i<list.size();i++)
               System.out.println(list.get(i) * 2);
       };

        listConsumer.accept(Arrays.asList(1,2,3));

        Consumer<List<String>> consumer = (a) -> a.stream().forEach(System.out::println);

        List<String> l1 = new ArrayList<>();
        l1.add("kathir");
        l1.add("vikki");
        l1.add("kathirvikki");

        consumer.accept(l1);


    }
}
