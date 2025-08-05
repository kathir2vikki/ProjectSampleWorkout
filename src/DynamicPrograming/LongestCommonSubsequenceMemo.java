package DynamicPrograming;

import java.util.Arrays;

public class LongestCommonSubsequenceMemo {


    public static void main(String[] a) {
        String s1 = "AXYT";
        String s2 = "AYZX";

        int m = s1.length();
        int n = s2.length();

        int[][] memo = new int[m + 1][n + 1];

        int finalReault = recMemo(s1, s2, m, n, memo);
        System.out.println("final ===" + finalReault);
    }


    static int recMemo(String s1, String s2, int m, int n, int[][] memo) {


        if (m == 0 || n == 0)
            return 0;


        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return memo[m][n] = 1 + recMemo(s1, s2, m - 1, n - 1, memo);
        }
        return memo[m][n] = Math.max(recMemo(s1, s2, m, n - 1, memo), recMemo(s1, s2, m - 1, n, memo));

    }
}
