class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i<nums.length; i++){
            //add the indexes together
            for(int j= i+1; j<nums.length; j++){

                int testNum = nums[i] + nums[j];

                if (testNum == target){
                return new int[] {i, j};
                }
            }
        }
        return new int[]{};
    }
}