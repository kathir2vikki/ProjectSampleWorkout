package JAVA8.lamda;

public class CodeOne {

    static String s = "test";

    public static void main(String[] z) {
        LambdaClass t = () -> {
            String s = "Lambda";
            System.out.println(CodeOne.s);
        };
        t.get();
    }

    interface LambdaClass {
        void get();

    }
}
