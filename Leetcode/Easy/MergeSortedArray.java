class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i= m-1; //point  nums1 last valid element
        int j=n-1; //point last nums2 elemment
        int k = m+ n -1; //point m+n last element

        while(i>=0 && j>=0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }
            else {
                nums1[k] =  nums2[j];
                    j--;
            }
            k--;
            
        }
        while(j>= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
            
    }
}