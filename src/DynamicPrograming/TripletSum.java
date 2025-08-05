package DynamicPrograming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TripletSum {


    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> list = new ArrayList<>();
        int suma = 0, sumb = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {

                suma += 1;
            }


            if (a.get(i) < b.get(i)) {
                sumb += 1;
            }


        }

        list.add(suma);
        list.add(sumb);

        return list;
    }

    public static void main(String[] a) {
        List<Integer> l1 = List.of(17, 28, 30);
        List<Integer> l2 = List.of(50, 8, 3);

        List<Integer> finalList = compareTriplets(l1, l2);

        finalList.stream().forEach(System.out::println);
    }
}
