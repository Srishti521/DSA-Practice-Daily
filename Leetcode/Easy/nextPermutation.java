class Solution {
    public void nextPermutation(int[] nums) {
        // -2 because we need to compare with [i+1]
        int i = nums.length-2;

        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        //if found, find the just larger element of i(idx j)
        if(i>=0){
            int j =nums.length-1;
            while(nums[j] <= nums[i]){
                j--;
            }
            //swap nums[i] and nums[j]
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] =  temp;
        }
        //Reverse the rest of the array
        reverse(nums, i+1, nums.length-1);
    }
    private void reverse(int nums[], int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end]= temp;
            start++;
            end--;
        }
    }
}