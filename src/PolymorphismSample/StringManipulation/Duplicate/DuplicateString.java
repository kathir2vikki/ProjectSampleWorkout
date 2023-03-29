package PolymorphismSample.StringManipulation.Duplicate;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateString {

    public static void main(String a[]) {
        String stringOne = "hello kathir hello vikki kathir kathir hi hi";

        String[] stringTwo = stringOne.split(" ");
        Map<String, Integer> hm = new HashMap<>();

        for (String word : stringTwo) {
            hm.merge(word, 1, Integer::sum);
        }

        System.out.println(hm);

        for (Map.Entry hme : hm.entrySet()){
            System.out.println(hme);

        }

        Set hmset = hm.entrySet();

        System.out.println(hmset);
    }

}
