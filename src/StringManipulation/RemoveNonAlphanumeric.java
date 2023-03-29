package StringManipulation;

public class RemoveNonAlphanumeric {

    public static void main(String[] a)
    {
        String regExp = "[^a-zA-Z0-9]";
        String inputString = "kathir#$Vikki&&&";

        String outputString = inputString.replaceAll(regExp,"");

        System.out.println("Output String === " + outputString);

        String newString = "";
        for(int i = 0; i<inputString.length(); i++) {
            char charstring = inputString.charAt(i);

            int charAscii = (int)charstring;

            if(charAscii >= 65 && charAscii <=90 || charAscii >= 97 && charAscii <= 122)
            {
                newString = newString + charstring;
            }


        }
        System.out.println(newString);
    }
}
