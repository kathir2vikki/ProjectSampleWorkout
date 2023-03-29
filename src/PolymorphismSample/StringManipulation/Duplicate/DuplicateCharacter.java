package PolymorphismSample.StringManipulation.Duplicate;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {

    public static void main(String[] args) {
        String string1 = "Great responsibility Great";
       char string[] = string1.toCharArray();

       Map<Character, Integer> hashMap = new HashMap<>();

       for(int i = 0; i<string1.length(); i++)
       {
           for (int j = i+1; j<string1.length();j++)
           {
               Integer value = hashMap.get(string[i]);
               if(value == null)
                   value = 1;
               if(string[i] == string[j])
                   hashMap.put(string[i],value + 1);
               else
                   hashMap.put(string[i],value);

           }
       }

        System.out.println(hashMap);
    }
}
