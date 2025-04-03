class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long ans = 0;
        for(int j=1;j<n-1;j++)
        {
            int a=0;
            for(int i=j-1;i>=0;i--)
            {
                a = Math.max(a,nums[i]);
            }
            int c=0;
            for(int k=j+1;k<n;k++)
            {
                c= Math.max(c,nums[k]);
            }
            long value = (a -nums[j])*(long)c;
            if(value > ans)
            {
                ans = value;
            }
        }
        return ans;
    }
}