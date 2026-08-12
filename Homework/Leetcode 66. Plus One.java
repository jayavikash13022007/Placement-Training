class Solution {
    public int[] plusOne(int[] digits) {
        int num = 0;
        int n = digits.length;
        digits[n-1] += 1;
        for(int i=n-1;i>-1;i--){
            digits[i] += num;
            if(digits[i]==10){
                digits[i] = 0;
                num = 1;
            }
            else{
                num = 0;
                break;
            }
        }
        if(num==0){
            return digits;
        }
        int[] lst = new int[n+1];
        lst[0] = 1;
        for(int i=1;i<n+1;i++){
            lst[i] = digits[i-1];
        }
        return lst;
    }
}