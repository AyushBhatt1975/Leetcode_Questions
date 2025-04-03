class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxProd = 0;
        long maxNum = 0;
        long maxDiff = 0;
        for (int num : nums) {
            maxProd = Math.max(maxProd, (long) maxDiff * num);
            maxNum = Math.max(maxNum, num);
            maxDiff = Math.max(maxDiff, maxNum - num);
        }
        return maxProd > 0 ?  maxProd : 0;
    }
}