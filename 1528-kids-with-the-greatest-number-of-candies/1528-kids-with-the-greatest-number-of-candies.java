class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        final List<Boolean> ans = new ArrayList<>();
        for (int i = 1; i < candies.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies < max) {
                ans.add(false);
            } else {
                ans.add(true);
            }
        }
        return ans;
    }
}