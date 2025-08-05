package DynamicPrograming;

import java.util.HashMap;

public class Fibonacci {


    public static void main (String[] ar)
    {
        int n =10;
        int finalresult = fibo(n);

        System.out.println(finalresult);

        int finalresultfibona = fibona(n);

        System.out.println(finalresultfibona);
    }


    static int fibo(int n)
    {
        if(n<=1)
            return n;

        int res = fibo(n-1) + fibo(n-2);
        return res;

    }

    static int fibona(int n)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();

        if(n<=1)
            return n;

        if(hm.containsKey(n))
            return hm.get(n);

        int res = fibona(n-1) + fibona(n-2);
        hm.put(n,res);
                return res;
    }
}
