class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int n=nums1.length;
        int m = nums2.length;
        int[] arr = new int[n+m];
        int i=0,j=0,k=0;
        
        while(i<n && j<m){
            if(nums1[i] <= nums2[j]){
                arr[k++] = nums1[i++];
            }else{
                arr[k++] = nums2[j++];
            }
        }
        while(i<n){
            arr[k++] = nums1[i++];
        }
        
        while(j<m){
            arr[k++] = nums2[j++];
                
            }
            if((n+m)%2 ==0){
                int mid=(n+m)/2;
                return (double)(arr[mid-1]+arr[mid])/2.0;
            }else{
                return (double)arr[(n+m)/2];
            }
    }
}
