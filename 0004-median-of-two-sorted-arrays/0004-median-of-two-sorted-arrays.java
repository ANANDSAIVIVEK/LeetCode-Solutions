class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = nums1.length;
        int b = nums2.length;
        int totalnum[] = new int[a+b];
        int n = totalnum.length;
        double ans = 0.0;
        for(int i = 0; i < nums1.length; i++){
            totalnum[i] = nums1[i];
        }
        for(int i = 0; i < nums2.length; i++){
            totalnum[a+i] = nums2[i];
        }
        Arrays.sort(totalnum);

        if(totalnum.length%2 == 0){
           ans =  (totalnum[n/2 -1]+totalnum[n/2])/2.0;
        }
        else{
            ans =  totalnum[n/2];
        }
       return ans;
    }
}