public class sampl {

    public static void main(String args[]) {

        int arr[] = {1, 2, 2, 3, 3, 4, 4};

        countoccurnce(arr);

    }


    public static void countoccurnce(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int count = 1;

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                    count++;

                    break;

                } else if (count > 1)

                    System.out.println(arr[i] + "->" + count);

                i += count - 1;

            }
        }
    }
}