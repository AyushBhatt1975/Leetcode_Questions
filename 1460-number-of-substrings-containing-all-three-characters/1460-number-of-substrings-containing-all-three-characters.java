class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int[] arr = { -1, -1, -1 };
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            arr[ch[i] - 97] = i;
            int min = arr[0] < arr[1] ? arr[0] : arr[1];
            min = arr[2] < min ? arr[2] : min;
            count += (min + 1);
        }
        return count;
    }
}