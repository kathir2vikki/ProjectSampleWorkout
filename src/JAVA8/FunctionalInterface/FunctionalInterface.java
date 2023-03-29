package JAVA8.FunctionalInterface;

@FunctionalInterface
interface Fninterface{
    String cal();

    default void sub()
    {
        System.out.println("hello default method");
    }
    default void adad()
    {
        System.out.println("hello default method");
    }

    static void mul()
    {
        System.out.println("hello static method");
    }

    static void dic()
    {
        System.out.println("hello static method");
    }


}
class FunctionalInterfaces {

    public  static void main(String a[]) {
        int b = 5;
        Fninterface fninterface = () -> "kathir";
        fninterface.sub();
        Fninterface.mul();
        System.out.println(fninterface.cal());

        new Thread(() -> {

               System.out.println("Calling runnable");
        }).start();

    }

}
