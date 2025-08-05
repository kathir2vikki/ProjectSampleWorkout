package generics;

public class BasicGenerics {
}


class Generics<T>
{
    public Generics(T data) {
        this.data = data;
    }

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    }

    class CallGenerics
    {
        public static void main (String[] p)
        {
            Generics<String> g1 = new Generics<>("kathir");

            System.out.println("print string " + g1.getData());

            Generics<Integer> g2 = new Generics<>(1234);

            System.out.println("print integer" + g2.getData());
        }
    }
