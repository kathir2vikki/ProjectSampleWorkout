package DynamicPrograming;

import java.util.HashMap;
import java.util.Map;

public class Anagram {


    static boolean checkAnagram(String s1, String s2)
    {
        if(s1.length()!=s2.length())
        {
            return false;
        }
        Map<Character, Integer> hm =new HashMap<>();
        for(int i =0; i<s1.length(); i++)
        {
            char ch = s1.charAt(i);
            hm.put(ch, hm.getOrDefault(ch,0) +1 );

        }

        for(int i=0; i<s2.length();i++)
        {
            char ch = s2.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) -1);
        }

        for(Map.Entry<Character, Integer> chMap : hm.entrySet())
        {
            if(chMap.getValue() !=0)
            {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] a)
    {
        String s1 = "ARMY";
        String s2 = "MBRY";

        boolean isAnagramOrNot = checkAnagram(s1,s2);

        if(isAnagramOrNot)
        {
            System.out.println(s1 + " and " + s2 + " is anagram");
        }
        else
        {
            System.out.println(s1 + " and " + s2 + " is not anagram");
        }

    }
}
