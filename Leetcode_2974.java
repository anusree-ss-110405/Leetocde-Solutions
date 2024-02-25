import java.util.*;
public class Leetcode_2974 {
    public static int[] numberGame(int[] nums) 
    {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i+=2)
        {
            int temp=nums[i];
            nums[i]=nums[i-1];
            nums[i-1]=temp;
        }
        return nums;
    }
    public static void main(String[] args)
    {
        int[] nums = {5, 4, 2, 3};
        nums = numberGame(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
