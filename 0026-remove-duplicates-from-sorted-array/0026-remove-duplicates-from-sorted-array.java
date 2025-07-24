
import java.util.ArrayList;
import java.util.Set;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i=0;
        for(int j=1; j < nums.length; j++) {
            if(nums[j] != nums[i]) { //if unique, iterate i and add it next.
                i++;
                nums[i] = nums[j]; //replace i with next unique int
            }
        }
        //if i ends at index 5 that means there are 6 unique ints.
        return i+1;

//        //if space was not limited, use a hashset.
//        Set<Integer> unique = new HashSet<Integer>();
//        for(int num : nums) {
//            unique.add(num);
//        }
//        int i=0;
//        for(int num : unique) {
//            nums[i++] = num;
//        }
//        return unique.size();
    }

}
