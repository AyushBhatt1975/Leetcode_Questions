class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int[] arr=nums;
        if(arr.length == 0) return 0;
        int sum = arr[0];
        int maxSoFar = arr[0];
        int maxTotal = arr[0];
        int minTotal = arr[0];
        int minSoFar = arr[0];
        
        for(int i=1;i<arr.length;i++){
            int num = arr[i];
            maxSoFar = Math.max(num,maxSoFar + num);
            maxTotal = Math.max(maxSoFar , maxTotal);
            
            minSoFar = Math.min(num, minSoFar + num);
            minTotal = Math.min(minSoFar,minTotal);
            
            sum += num;
        }
        
        if(sum == minTotal) return maxTotal;
        return Math.max(sum - minTotal,maxTotal);
    }
}
