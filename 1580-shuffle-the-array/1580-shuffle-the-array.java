class Solution {
    public int[] shuffle(int[] nums, int n) {
        int start = 0;
        int randPoint = n;
        int result[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                result[i] = nums[start];
                start++;
            }
            else{
                result[i] = nums[randPoint];
                randPoint++;
            }
        }
        return result;
    }
}