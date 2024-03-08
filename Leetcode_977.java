import java.util.*;
class Leetcode_977 {
    public int[] sortedSquares(int[] nums) {
       for(int i=0;i<nums.length;i++)
       {
         int h=nums[i];
         int r=h*h;
         nums[i]=r;
       }
       Arrays.sort(nums);
       return nums;
    }
}