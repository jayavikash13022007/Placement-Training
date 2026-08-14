class Solution {
    int maxing(int i, int j, int[] nums){
        if(i > j) return 0;
        int max = Integer.MIN_VALUE;
        int left = 1, right = 1;
        for(int k = i; k < j; k++){
            left *= nums[k];
            right *= nums[j-k+i-1];
            max = Math.max(max,Math.max(left,right));
        }
        return max;
    }
    public int maxProduct(int[] nums) {
        int left = 0, max = Integer.MIN_VALUE;
        for(int right = 0; right < nums.length; right++){
            if(nums[right] == 0){
                max = Math.max(0,Math.max(max,maxing(left,right,nums)));
                left = right+1;
            }
        }
        max = Math.max(max,maxing(left,nums.length,nums));
        return max;
    }
}