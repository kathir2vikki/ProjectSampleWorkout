package DynamicPrograming;

public class LongSubStringWitjoutReapChar {
    static int longSubSetString(String s)
    {
        int left = 0, right = 0;

        int window = 0;

        char[] s1 = s.toCharArray();

        boolean value[] = new boolean[26];

        while(right < s.length()) {
            while (value[s.charAt(right) - 'a'] == true)
            {
                value[s.charAt(left) - 'a'] = false;
                left++;
            }

            value[s.charAt(right) - 'a'] = true;

            window = Math.max(window, (right-left+1));
            right ++;
        }

        return window;
    }
    public static void main(String[] ar)
    {
        String s = "geek";

        int outString = longSubSetString(s);

        System.out.println("output ====" + outString);
    }
}
