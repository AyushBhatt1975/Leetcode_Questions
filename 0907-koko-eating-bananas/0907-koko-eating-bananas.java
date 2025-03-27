class Solution 
{
    static boolean check( int piles[], int n, int h, int mid)
    {
         long hoursTaken=0;
        
        for(int i=0;i<n;i++)
        {
              hoursTaken += piles[i]/mid;
            
             if(piles[i]%mid!=0)
                 hoursTaken++;
        }
        
        if(hoursTaken<=h)
            return true;
        else
            return false;
    }
    public int minEatingSpeed(int[] piles, int h)
    {
       
        int hi= 0;
        
        int n= piles.length;
        
        int lo= 1;
        
        for(int i=0;i<n;i++)
        {
             hi = Math.max(hi,piles[i]);
        }
        
        int ans=-1;
        
        while(lo<=hi)
        {
            int mid= lo + (hi-lo)/2;
            
            if(check(piles,n,h,mid)==true)
            {
                ans= mid;
                hi =  mid-1;
            }
            else
            {
                 lo= mid+1;
            }
        }
        return ans;
        
    }
}