package smallprograms;

public class ArmstrongNumber {

private static int power(int x)
{
    int count = 0;
    while(x != 0)
    {
        count ++;
        x = x / 10;
    }
    return count;
}

    public static void main (String[] a)
    {
        int n = 153;

        int b = n;

        int temp = 0;

        int r;
        while(n != 0)
        {
            r = n % 10;

            temp = (int) (temp + Math.pow(r, power(b)));

            n = n / 10;

        }

        if(temp == b)
            System.out.println("final result" );
        else
            System.out.println("false");
    }

}
