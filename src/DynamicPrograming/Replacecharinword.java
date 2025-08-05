package DynamicPrograming;

import java.util.ArrayList;
import java.util.List;

public class Replacecharinword {



    static List<String> replaceCharIn(String s,int c)
    {
        List<String> replacedCharList = new ArrayList<>();

        for(int i = 0;i<s.length();i++)
        {
            StringBuffer sb = new StringBuffer(s);
            sb.setCharAt(i,'z');
            replacedCharList.add(sb.toString());
        }
        return replacedCharList;
    }

    public static void main(String[] ar)
    {
        String s = "food";
        int replaceChar = 1;

        List<String> l1 = replaceCharIn(s, replaceChar);

        l1.stream().forEach(System.out::println);
    }
}
