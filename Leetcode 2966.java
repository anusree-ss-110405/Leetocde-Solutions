import java.util.*;
class Solution {
    public int[][] divideArray(int[] nums, int k) {
        if(nums.length % 3 != 0)
        {
            return new int [][] {};
        }
        int [][] ans = new int[nums.length/3][3];
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i+=3)
        {
            if(nums[i+2]-nums[i]>k)
            {
                return new int [][] {};
            }
        }
        int index = 0;
        for(int i=0;i<nums.length/3;i++)
        {
            for(int j=0;j<3;j++)
            {
                ans[i][j]=nums[index];
                index++;
            }
        }
        return ans;
    }
}