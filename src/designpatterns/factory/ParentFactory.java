package designpatterns.factory;

public interface ParentFactory {

    public void display(String a);
    public String print(String b);
}

class chileOne implements ParentFactory{

    @Override
    public void display(String a) {
        System.out.println("calling chileone display mrthod" + a);
    }

    @Override
    public String print(String b) {
        return b;
    }
}

class chiledTwo implements ParentFactory{

    @Override
    public void display(String a) {
        System.out.println("calling chiletwo display mrthod" + a);
    }

    @Override
    public String print(String b) {
        return b;
    }
}

