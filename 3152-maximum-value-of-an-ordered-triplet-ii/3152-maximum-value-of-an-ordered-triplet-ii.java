class Solution {
    public long maximumTripletValue(int[] nums) {
        int prefix[] = new int[nums.length];
        int suffix[] = new int[nums.length];
        long result = 0;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            prefix[i] = Math.max(prefix[i - 1], nums[i - 1]);
            suffix[n - 1 - i] = Math.max(suffix[n - i], nums[n - i]);
        }
        for (int i = 1; i < n - 1; i++) {
            result = Math.max(result, (long) (prefix[i] - nums[i]) * suffix[i]);
        }
        return result;
    }
}