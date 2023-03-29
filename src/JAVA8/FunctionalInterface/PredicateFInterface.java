package JAVA8.FunctionalInterface;


@FunctionalInterface
interface Predicate
{
    Boolean test(String s);
}

@FunctionalInterface
interface IntPredicates
{
    Boolean sum(int v);
}

@FunctionalInterface
interface BiPredicate
{
    Boolean test(int a, int b);
}
public class PredicateFInterface {
    public static void main(String a[])
    {
        Predicate p = (s) -> s.equals("kathir");


        if(p.test("kathirs"))
            System.out.println("true");

        else
            System.out.println("false");

        IntPredicates ip = (v) -> v == 3;

        if(ip.sum(3))
            System.out.println(ip.sum(3));

        BiPredicate biPredicate = (y,z) -> y == z;

        System.out.println("Bi Predicate check for ===" + biPredicate.test(2,7));

        kathir kathir = (k) -> k.equals("vikkis");

        System.out.println("Vikki ===== " + kathir.pInterface("vikki"));

        kathirConsumer kathirConsumer = (x) -> System.out.println(x);

        kathirConsumer.display("printing kathir by customized consumer");

    }
}

@FunctionalInterface
interface kathir {
    public boolean pInterface(String k);
}

@FunctionalInterface

interface kathirConsumer{
    public void display(String a);
}
