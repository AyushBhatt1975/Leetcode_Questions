class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();
        if(n==1){
        ans.add(0);
        ans.add(1);
        return ans;
        }
         List<Integer> prev = grayCode(n-1);
         for(int i=0;i<prev.size();i++){
            ans.add(prev.get(i));
         }
        for(int i = ans.size()-1;i>=0;i--){
            ans.add((int)Math.pow(2,n-1)+prev.get(i));
        }
        return ans;
    }
}