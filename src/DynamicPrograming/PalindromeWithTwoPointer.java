package DynamicPrograming;

public class PalindromeWithTwoPointer {


    static boolean isPalindrom(String s)
    {
        char[] c = s.toCharArray();
        int left = 0, right = c.length -1 ;

        while(left < right)

        {
            if(c[left] != c[right])
                return false;

            left ++;

            right --;

        }
        return true;
    }



    public static void main(String[] arg)
    {
        String s = "madam";

        boolean palin = isPalindrom(s);

        String finalPalin = palin ? "isPalindreom" : "non palindrom";

        System.out.
                println("finalresult ===" + finalPalin);
    }
}
