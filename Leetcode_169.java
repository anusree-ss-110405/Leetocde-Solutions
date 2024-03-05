import java.util.*;
class Leetcode_169 {
    public int majorityElement(int[] nums) {
       int n=nums.length; 
        Arrays.sort(nums);
        return nums[n/2];
    }
}