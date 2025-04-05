class Solution {
    public int sum(int[] nums,int i,int xor,int n){
        if(i==n){
            return xor;
        }
        int take = sum(nums,i+1,xor^nums[i],n);
        int notake = sum(nums,i+1,xor,n);
        return take+notake;
    }
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        return sum(nums,0,0,n);
    }
}