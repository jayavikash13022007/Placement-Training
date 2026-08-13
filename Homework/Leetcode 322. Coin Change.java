import java.util.*;
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        for(int i = 0; i < coins.length; i++){
            for(int j = 0; j < amount+1; j++){
                if(coins[i] <= j) dp[j] = Math.min(dp[j],1+dp[j-coins[i]]);
            }
        }
        if(dp[amount] > amount) return -1;
        return dp[amount];
    }
}