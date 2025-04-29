class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0 ;
        int sum =0;
        for(int i=0;i<n;i++){
            currsum += nums[i];
            maxsum = Math.max(maxsum,currsum);
            currsum = Math.max(currsum,0);
        }
        return maxsum;

    }
}