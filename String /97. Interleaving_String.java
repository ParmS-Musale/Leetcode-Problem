class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int m = s1.length();
        int n = s2.length();
        
        if (m + n != s3.length()) {
            return false;
        }

        int[][] memo = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            Arrays.fill(memo[i], -1);
        }

        return isInterleaveHelper(s1, s2, s3, 0, 0, 0, memo);
    }

    private boolean isInterleaveHelper(String s1, String s2, String s3, int i, int j, int k, int[][] memo) {
        if (memo[i][j] != -1) {
            return memo[i][j] == 1;
        }

        boolean x = false, y = false;

        if (i == s1.length() && j == s2.length() && k == s3.length()) {
            return true;
        }

        if (i != s1.length() && s1.charAt(i) == s3.charAt(k)) {
            x = isInterleaveHelper(s1, s2, s3, i + 1, j, k + 1, memo);
        }

        if (j != s2.length() && s2.charAt(j) == s3.charAt(k)) {
            y = isInterleaveHelper(s1, s2, s3, i, j + 1, k + 1, memo);
        }

        memo[i][j] = (x || y) ? 1 : 0;
        return memo[i][j] == 1;
    }
}
