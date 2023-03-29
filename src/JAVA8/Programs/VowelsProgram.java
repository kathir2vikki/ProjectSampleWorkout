package JAVA8.Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VowelsProgram {



    public static void main(String[] arg)
    {
        List<Character> a = new ArrayList<>(Arrays.asList('a','e','i','o','u'));

        String s = "Hello world";

        s = s.toLowerCase();

        long vowelCount = 0;

        vowelCount = s.chars().filter(z -> !a.contains((char) z)).count();

        System.out.println("vowelCount ===== " + vowelCount);
    }


}
