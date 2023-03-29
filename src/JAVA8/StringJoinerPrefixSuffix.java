package JAVA8;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerPrefixSuffix {


    public static void main(String ag[])
    {
        StringJoiner sj = new StringJoiner(",","%","#");
        sj.add("kathir");
        sj.add("vikki");
        System.out.println(sj);

        String ka = "hello vikki kathir";
        String[] vi = ka.split(" ");

        String viii  = "%" + vi[0];
        System.out.println("viii====" + viii);
        vi[0] = viii;

        System.out.println("viii====" + vi[0]);
        String viiii = vi[vi.length-1] + "%";
        System.out.println("viiii====" + viiii);
        vi[vi.length-1] = viiii;

        StringBuffer finalString = new StringBuffer();
        for(int d = 0 ; d <vi.length;  d++)
        {
            System.out.println("asdasdasd = " + vi[d]);
           // finalString.append("%");
            finalString.append(vi[d]);
         //   finalString.append("%");
        }

        System.out.println("finalString" + finalString);
        char[] ch = vi[0].toCharArray();

        String chString = "#" + ch[0] + ch[ch.length-1] + "#";

        System.out.println("chString" + chString);

        System.out.println("vi === " + Arrays.stream(vi).collect(Collectors.joining()));

    }
}
