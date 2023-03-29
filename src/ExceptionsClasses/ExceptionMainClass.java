package ExceptionsClasses;

public class ExceptionMainClass {


    public static void main(String[] a)
    {
        try {

            int i = 1000/0;
            System.out.println(i);

            int s = 1000/100;

            System.out.println("s===" +s);

        }catch(Exception e)
        {
            System.out.println(e);

        }
    }
}
