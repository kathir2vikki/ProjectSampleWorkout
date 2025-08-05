package DynamicPrograming;

public class LongestCommonSubsequence {


    public static void main(String[] arg)
    {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        int lcs = lcsString(s1,s2);


        System.out.println(lcs);
    }


    static int lcsString(String s1, String s2)
    {
        int n = s1.length();
        int m = s2.length();


        int[][] lcsDimen = new int[n + 1][m + 1];

        for(int i = 1; i<=n ;i++)
        {
            for(int j = 1; j<=m; j++)
            {
                if(s1.charAt(i-1) == s2.charAt(j-1))
                {
                    lcsDimen[i][j] = lcsDimen[i-1][j-1] + 1;
                }
                else {
                    lcsDimen[i][j] = Math.max(lcsDimen[i-1][j], lcsDimen[i][j-1]);
                }
            }

        }
        return lcsDimen[n][m];
    }
}
