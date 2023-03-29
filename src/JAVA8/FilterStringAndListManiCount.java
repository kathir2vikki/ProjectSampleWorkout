package JAVA8;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterStringAndListManiCount {

    static class Employee{
        private int id;

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        private String name;

        Employee(int id, String name)
        {
            this.id = id;
            this.name = name;
        }

    }

    public static void main(String p[])
    {
        List<String> listString = Arrays.asList("kathir", "vikki", "pyaaaaa");

       listString.stream().filter(s -> s.length() > 3).forEach(System.out::println);


       List<Integer> integerList = Arrays.asList(3,4,5);

       integerList.stream().map(i -> i * 3).forEach(System.out::println);

       List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "kat"));
        employeeList.add(new Employee(2, "Vikh"));


        employeeList.stream().filter(e -> e.id >= 1)
        .filter(e -> e.name.length() > 3).forEach(System.out::println);

        List<String> stringList = Arrays.asList("A","B","C");
        List<String> stringList1 = Arrays.asList("D","E","F");

        Stream.concat(stringList.stream(),stringList1.stream()).forEach(System.out::println);



        List<String> stringList2 = Arrays.asList("1","2","1","2");

        stringList2.stream().collect(Collectors.toSet()).forEach(System.out::println);
 Collections.sort(stringList2);
        stringList2.stream().forEach(System.out::println);

        stringList2.stream().sorted().forEach(System.out::println);
        AtomicInteger k = new AtomicInteger();
        List<Integer> integerList1 = Arrays.asList(1,2,3,4,5);
        integerList1.stream()
                .map(v -> v + v).forEach(System.out::println);

        List<Integer> cubeList = Arrays.asList(1,2,3,4,5);

        cubeList.stream().map(z -> z*z*z).filter(x -> x > 50).forEach(System.out::println);


    }
}
