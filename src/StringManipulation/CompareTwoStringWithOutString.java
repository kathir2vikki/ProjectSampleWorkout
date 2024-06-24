package StringManipulation;

public class CompareTwoStringWithOutString {

    public boolean compareString(String s1, String s2)
    {
        char[] ss1 = s1.toCharArray();
        char[] ss2 = s2.toCharArray();

        boolean compareString = true;
        if(ss1.length == ss2.length) {
            for (int i = 0; i < ss1.length - 1; i++) {
                if (ss1[i] == ss2[i]) {
                    break;
                } else {
                    compareString = false;
                }
            }

        }
        else
        {
            compareString = false;
        }
        return compareString;
    }

    public static void main(String[] args)
    {
        CompareTwoStringWithOutString compareTwoStringWithOutString = new CompareTwoStringWithOutString();

        String sss11 = "kathir";
        String sss22 = "vathir";

        boolean finalResult = compareTwoStringWithOutString.compareString(sss11,sss22);

        System.out.println("Final reslut ===" + finalResult);
    }
}
