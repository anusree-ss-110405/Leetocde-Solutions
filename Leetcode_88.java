import java.util.*;
class Leetcode_88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int j=0,i=m;j<n;j++)
        {
            nums1[i]=nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
    public static void main(String[] args)
    {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        int m=nums1.length;
        int n=nums2.length;
        merge(nums1,m,nums2,n);
    }
}