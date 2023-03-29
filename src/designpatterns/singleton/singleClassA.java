package designpatterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class SingletonClass {


    private static SingletonClass instance;

    private SingletonClass() {

        if(instance != null)
        {
            throw new IllegalStateException("Singleton already created");
        }
    }

    public static SingletonClass getInstanceMethod() {
        if (instance == null) {
            return instance= new SingletonClass();
        } else {
            return instance;
        }
    }

    public void display() {
        System.out.println("Print singlton method");
    }
}

public class singleClassA {

    public static void main(String[] a) throws InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        SingletonClass sg = SingletonClass.getInstanceMethod();
        System.out.println("sg ====" + sg.hashCode());
        sg.display();


        SingletonClass sgOne = SingletonClass.getInstanceMethod();
        System.out.println("sgOne ====" + sgOne.hashCode());
        sgOne.display();

        SingletonClass i3 = null;
                Constructor[] constructors = SingletonClass.class.getDeclaredConstructors();


        for(Constructor constructor : constructors)
        {
            constructor.setAccessible(true);
            i3 =(SingletonClass)constructor.newInstance();
            break;
        }

        System.out.println("i3 ====" + i3.hashCode());



    }
}
