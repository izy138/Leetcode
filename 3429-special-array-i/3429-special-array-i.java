class Solution {
    public boolean isArraySpecial(int[] nums) { // [ 1, 2, 4, 5] //odd,even,even,odd
    // special? [1,2] true [2,4] false [4,5] true

    //check if index 0 is even or odd,
    //check if next index 1 is even or odd
    //use a counter to keep track of which pair we are looking at.

    //
    boolean special;

    for (int i=0; i<nums.length-1; i++){
        if (nums[i] % 2 == nums[i+1] % 2){ //is the remainder is 0 == 0 == both even
            return false;
        }
    }
    return true;
        
    }   
}