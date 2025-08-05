package designpatterns.factory;

public class FactoryClass {

    public static ParentFactory callChild(String type) {

        if (type.equals("child")) {
            return new chileOne();
        } else {
            return new chiledTwo();
        }
    }

    public static void main(String[] aj) {

        ParentFactory parentFactory = FactoryClass.callChild("child");
        parentFactory.display("kathir");
        ParentFactory parentFactoryONe = FactoryClass.callChild("sds");
        parentFactoryONe.display("vikki");
    }
}
