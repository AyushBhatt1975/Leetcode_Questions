class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();
        int begin = 0;

        for (int end = 0; end < n; end++) {
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end));
                maxLength = Math.max(maxLength, end - begin + 1);
            } else {
                while (set.contains(s.charAt(end))) {
                    set.remove(s.charAt(begin));
                    begin++;
                }
                set.add(s.charAt(end));
            }
        }
        return maxLength;
    }
}