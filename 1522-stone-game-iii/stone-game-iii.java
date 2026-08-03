class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        int[] dp = new int[n + 1];
        
        // Iterate backwards from the end of the array
        for (int i = n - 1; i >= 0; i--) {
            int take = 0;
            int maxScore = Integer.MIN_VALUE;
            
            // A player can take 1, 2, or 3 stones
            for (int k = 1; k <= 3 && i + k <= n; k++) {
                take += stoneValue[i + k - 1];
                maxScore = Math.max(maxScore, take - dp[i + k]);
            }
            dp[i] = maxScore;
        }
        
        // Determine the winner based on Alice's relative score
        if (dp[0] > 0) {
            return "Alice";
        } else if (dp[0] < 0) {
            return "Bob";
        } else {
            return "Tie";
        }
    }
}