class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       if(nums == null || nums.length < 3) return new ArrayList<>();

       //sorting the elements
        Arrays.sort(nums);
        //creating new Hashset to store the result
        Set<List<Integer>> result = new HashSet<>();

        // Fixing the first element
        for(int i =0; i<nums.length-2; i++){ //-2 because we need the other tripet as well
        // now finding the other two elements
        int left = i+1;
        int right = nums.length-1;

        while(left < right){
            int sum = nums[i] + nums[left] + nums[right];

            if(sum == 0){
                //then add the set , move to find other triplet
                result.add(Arrays.asList(nums[i], nums[right], nums[left]));
                left++;
                right--;

            } else if (sum <0){
                left++;

            } else {
                right--;
            }
        }
        
        }
        return new ArrayList<>(result);
    }
}
