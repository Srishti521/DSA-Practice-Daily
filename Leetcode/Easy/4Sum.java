class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length < 4) return result;

        //sorting the array
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();

        //fix the ith place in nums
        for(int i = 0; i<nums.length-3; i++){
            for(int j =i+1; j<nums.length-2; j++){
            //now finding the three numbers
            int k =j+1;
            int m= nums.length-1;

            while(k<m){
                long sum = (long) nums[i] + nums [j] + nums[k] + nums[m];

             if(sum==target){
                    set.add(Arrays.asList(nums[i], nums [j] , nums[k] , nums[m]));
                    k++;
                    m--;
                } else if(sum <target){
                    k++;
                } else {
                    m--;

                }
            }
        }
    }
    return new ArrayList<>(set);
    }
}