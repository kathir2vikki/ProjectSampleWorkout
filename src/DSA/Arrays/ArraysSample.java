package DSA.Arrays;


import java.util.Arrays;

public class ArraysSample {


    public static void main (String a[])
    {
        int[] number = new int[3];

        number[0] = 1;
        number[1] = 2;
        number[2] = 3;

        System.out.println("Number array " + Arrays.toString(number));

        int[] num = {1,2,3,4};
        for(int nums : num)
            System.out.println("Array using primitive declartion " + nums);

//Using array class file methods

        Array ar = new Array(2);
        ar.insert(20);
        ar.insert(10);
        ar.insert(50);
        ar.insert(40);

        System.out.println(ar.indexOf(40));

        System.out.println(ar.searchOf(100));

        ar.sort();
        //ar.removeOf(2);
        ar.print();
    }
}
