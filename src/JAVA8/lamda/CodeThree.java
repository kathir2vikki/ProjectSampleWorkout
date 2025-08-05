package JAVA8.lamda;

public class CodeThree {


    public static void main(String[] z)
    {
        int x = 0 , y = 0;
        for(int i = 0;i <5 ; i++)
        {
            if((++x>2) || (++y>2))
                x++;
        }
        System.out.println(x +"  " +y);
    }
}
