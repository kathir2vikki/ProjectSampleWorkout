package PolymorphismSample.StringManipulation.Duplicate;

public class StringEquals {

    public static void main(String[] a)
    {
        String s1 = new String("kathir");
        String s2= new String("kathir");

        String s = s2 + "hello";

        System.out.println("S1===="+ s1+ "s2====" +s2);
        System.out.println("s1 ==== s2" + s1==s2);
        System.out.println("s1.equalss2" + s1.equals(s2));
    }
}
