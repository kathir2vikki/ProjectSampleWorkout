package JAVA8.lamda;

import java.util.concurrent.atomic.AtomicInteger;

public class CodeTwo {

    int x = 10;

    public void m2()
    {
        AtomicInteger y = new AtomicInteger(20);

        IntReference i = () -> {
            x = x+1;
            y.set(y.get() + 1);

            System.out.println("xxx=" + x);
            System.out.println("yyyyy=" + y);

        };
            i.m1();
        }

        public static void main(String[] z)
        {
            new CodeTwo().m2();
        }
    }

    interface IntReference{
    void m1();
    }
