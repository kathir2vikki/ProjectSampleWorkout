package DynamicPrograming;

public class Palindrom {


    static boolean isPali(int n){
        int rev = 0;
        int orn = n;
        while(n>0)
        {
            rev = rev * 10 + n % 10;
            n = n/10;
        }
        if(orn == rev) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main (String[] str)
    {
        int n = 121;

        boolean bl = isPali(n);

        String palin = bl ? "ispalli" : "no pali";

        System.out.println("final result --- " + palin);
    }
}
