class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;

        //    [2,  4,  2,  6]
        //    i,j              // j = val so iterate j for loop
        //    [2,  4,  2,  6]
        //     i   j           // j != val so replace nums[j] with nums[i], i++ and iterate j for loop 
        //    [4,  4,  2,  6]  
        //         i   j       // j = val so iterate j for loop
        //    [4,  4,  2,  6] 
        //         i       j   // j != val so replace i with j and i++
        //    [4,  6,  2,  6]  
        //             i       // i = 2 which is the number of elements != val
        // we reached the end of the for loop so now we return i.
        
        for(int j=0; j<nums.length; j++){
            if (nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
