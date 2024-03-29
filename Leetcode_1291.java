import java.util.*;
public class Leetcode_1291 {
    public static List<Integer> sequentialDigits(int low, int high) {
        String digits = "123456789";
        List<Integer> result = new ArrayList<>();
        int lowlen = String.valueOf(low).length();
        int highlen = String.valueOf(high).length();
        for(int left=lowlen;left<=highlen;left++)
        {
            for(int right=0;right<=digits.length()-left;right++)
            {
                String Substring = digits.substring(right, right+left);
                int num=Integer.parseInt(Substring);
                if(num>=low && num<=high)
                {
                    result.add(num);
                }
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        int l=100;
        int r=300;
        System.out.print(sequentialDigits(l,r));
    }
}