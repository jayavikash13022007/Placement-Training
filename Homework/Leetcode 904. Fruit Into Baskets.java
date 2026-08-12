class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0, max = 0;
        Map<Integer,Integer> d = new HashMap<>();
        for(int right = 0; right < fruits.length; right++){
            d.put(fruits[right],d.getOrDefault(fruits[right],0)+1);
            while(d.size() > 2){
                d.put(fruits[left],d.get(fruits[left])-1);
                if(d.get(fruits[left]) == 0) d.remove(fruits[left]);
                left++;
            }
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}