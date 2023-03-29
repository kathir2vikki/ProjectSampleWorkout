package FinalKeyWord;

public class FinalMainMethod {

    public static void main(String[] a)
    {
        FinalClass fk = new FinalClass(3,"kathirvikki");

/*        fk.setI(1);
        fk.setI(2);

        fk.setName("kathir");
        fk.setName("vikki");*/

        FinalClass fk1 = new FinalClass(4,"kathirvikki2");

        System.out.println("I=====" + fk1.getI() + "Name ==== " + fk1.getName());
    }
}
