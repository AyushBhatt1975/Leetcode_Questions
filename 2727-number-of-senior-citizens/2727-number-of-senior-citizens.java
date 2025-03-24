class Solution {
    public int countSeniors(String[] det) {
        int ct=0;
        for(String s:det){
            int age=10*(s.charAt(11)-'0')+s.charAt(12)-'0';
            if(age>60)
            ct++;
        }
        return ct;
    }
}