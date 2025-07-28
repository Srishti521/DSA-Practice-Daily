class Solution {
    public int[] findMissingAndRepeatedValues(int[][] nums) {
        int n = nums.length;
        int count[]= new int [n*n+1]; //array starts from 0 , & 0 is unused .
        int repeating = -1 ,missing =-1; //-1 is just a number it doesnt come in input.

        //counting the frequency 
        for (int[] row : nums) {          // ✅ corrected: iterate over each row
            for (int num : row) {         // ✅ corrected: iterate over each number in row
                count[num]++;
            }
        }
        //identifying the missing and repeating number
        for(int i =1; i<=n*n; i++){
            if(count[i] == 0){  
                missing =i;
            } else if(count [i]==2 ){
                repeating = i;
        }   }
        return new int[] { repeating , missing} ;
    }
}