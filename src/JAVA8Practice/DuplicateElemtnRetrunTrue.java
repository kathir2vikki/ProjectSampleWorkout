package JAVA8Practice;

import java.util.HashSet;
import java.util.List;

public class DuplicateElemtnRetrunTrue {

    public static void main(String[] z) {
        List<Integer> listInput = List.of(5, 6, 4, 1, 2);

        HashSet<Integer> hs = new HashSet<>();
        boolean b = listInput.stream().anyMatch(v-> !hs.add(v));
        System.out.println(b);
    }
}
