class Solution {
    public int majorityElement(int[] nums) {
        int majority =nums[0]; //suppose taking first element as majority
        int lead = 1; //take count(lead) as 1

       for(int  i =1; i<nums.length; i++){
        if(nums[i] == majority){ // same number  - increase lead
            lead ++;
        } else if(lead > 0){
            lead--;            // diff number- decrease lead
        } else {
            majority=nums[i];   //change candidate when lead = 0;
            lead=1;             // reset vote for new candidate.
        }    
       }
        return majority;
    }    
}