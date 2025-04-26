class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long res = 0;
        int badidx = -1, leftidx = -1 , rightidx = -1;

        for(int i=0;i<nums.length;++i){
            if(!(minK <= nums[i] && nums[i] <= maxK)) {
                badidx = i;
            }

            if(nums[i] == minK) {
               leftidx = i;
            }

            if(nums[i] == maxK){
                rightidx =i;
            }

            res +=  Math.max(0,Math.min(leftidx,rightidx)-badidx);
        }
        return res;
        
    }
}