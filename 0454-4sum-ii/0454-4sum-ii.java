class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int countTuples =0;
        for (int i : nums1) {
            for (int j : nums2) {
                int sum = i + j;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        for (int c : nums3) {
            for (int d : nums4) {
                int sum = c + d;
                countTuples += map.getOrDefault(-sum,0);
            }
        }
        return countTuples;

    }
}