// You are using Java
import java.util.*;
class Leetcode_2966 {
    public static int[][] divideArray(int[] nums, int k) {
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
    public static void main(String[] args)
    {
         int[] nums = {1, 3, 4, 8, 7, 9, 3, 5, 1};
        int k = 2;
        int[][] result = divideArray(nums, k);
        for (int[] arr : result) {
            System.out.println(Arrays.toString(arr));
        }
    };
}





