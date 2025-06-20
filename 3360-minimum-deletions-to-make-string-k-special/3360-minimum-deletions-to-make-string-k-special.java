import java.util.*;

class Solution {
    public int minimumDeletions(String word, int k) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : word.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        List<Integer> freqs = new ArrayList<>(freqMap.values());
        Collections.sort(freqs);
        int minDeletions = Integer.MAX_VALUE;

        for (int i = 0; i < freqs.size(); i++) {
            int base = freqs.get(i);
            int deletions = 0;

            // Delete all lower frequency characters
            for (int j = 0; j < i; j++) {
                deletions += freqs.get(j);
            }

            // Trim higher frequency characters
            for (int j = i+1; j < freqs.size(); j++) {
                if (freqs.get(j) > base + k) {
                    deletions += freqs.get(j) - (base + k);
                }
            }

            minDeletions = Math.min(minDeletions, deletions);
        }

        return minDeletions;
    }
}