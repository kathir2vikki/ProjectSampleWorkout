import java.util.ArrayList;
import java.util.List;

public class PackageProduct {

    public static void totalPackage()
    {
        List<Integer> smallPackNo = new ArrayList<>();
        List<Integer> largePackNo = new ArrayList<>();
        List<Integer> totalPackNo = new ArrayList<>();
        int number = 16;
        int smallPackSize = 1;
        int largePackSize = 5;
        int xlim = number/smallPackSize;
        int zlim = number/largePackSize;
        // loop thru all possibility
        for (int x = 0; x <= xlim; x++)
        {
                for (int z = 0; z <= zlim; z++)
                {
                    int totalProduct = smallPackSize*x +  largePackSize*z;
                    // if total product number equals what we requested, save this combination.
                    if (totalProduct == number && totalProduct != 0)
                    {
                        smallPackNo.add(x);
                        largePackNo.add(z);
                        totalPackNo.add(x  + z);
                    } } }
        totalPackNo.stream().forEach(a -> System.out.println(a));
    }
    public static void main(String a[])
    {
        totalPackage();
    }
}
