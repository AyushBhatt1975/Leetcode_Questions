class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum =Integer.MIN_VALUE;
        int start =0;
        int end =0;
        int sum=0;
        while(end<nums.length){
            if(sum < 0 && nums[end] >= sum){
                sum =0;
                start = end;
            }
            sum += nums[end];
            maxSum = Math.max(maxSum,sum);
            end++;

        }
        return maxSum;
    }
}