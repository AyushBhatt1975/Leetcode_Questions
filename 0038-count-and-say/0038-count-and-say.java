class Solution {
    public String countAndSay(int n) {
     if(n==1)return "1";
     String p=countAndSay(n-1);
     StringBuilder result = new StringBuilder();
     int i=0;
     while(i<p.length()){
        char ch = p.charAt(i);
        int count =0;
        
     while(i < p.length() && p.charAt(i)==ch){
        count++;
        i++;
     }
     result.append(count).append(ch);
    }
    return result.toString();
}
}