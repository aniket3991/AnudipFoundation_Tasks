package assignment13;

class Solution {
    final int[][] map = {{4, 6},
            {6, 8},
            {7, 9},
            {4, 8},
            {0, 3, 9},
            {},
            {0, 1, 7},
            {2, 6},
            {1, 3},
            {2, 4}};
    static final int[][] dp = new int[5001][10];
    static final int mod = (int) 1e9 + 7;

    public int knightDialer(int n) {
        if (n == 1)
            return 10;

        long ans = 0;

        for (int i = 0; i < 10; i++) {
            if (i == 5)
                continue;
            ans += count(i, dp, n);
        }
        return (int) (ans % mod);
    }

    private long count(int idx, int[][] dp, int r) {
        if (r == 1)
            return 1;
        if (dp[r][idx] != 0)
            return dp[r][idx] % mod;

        long k = 0;
        if (idx == 4 || idx == 6)
            k = count(map[idx][2], dp, r - 1);
        dp[r][idx] = (int) ((count(map[idx][0], dp, r - 1) + count(map[idx][1], dp, r - 1) + k) % mod);
        return dp[r][idx];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.knightDialer(3131));
    }
}



