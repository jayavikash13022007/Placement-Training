class Solution {
    public int divide(int dividend, int divisor) {
        long ans = (long)dividend/divisor;
        if(ans > 2147483647) return 2147483647;
        if(ans < -2147483648) return -2147483648;
        return (int)ans;
    }
}