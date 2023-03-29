package collections;

import java.util.*;

public class ArrayListClass {


    public static void main (String[] a)

    {
        Employe emp = new Employe(1,"kathir");
        Employe emp2 = new Employe(1,"kathir");

        List<Employe> l1 = new ArrayList<>();

        l1.add(emp);
        l1.add(emp2);

        l1.forEach(System.out::println);

        Optional<Integer> sum = Arrays.asList(1,2,3,4).stream().reduce(Integer::sum);

        System.out.println(sum);
    }
}
