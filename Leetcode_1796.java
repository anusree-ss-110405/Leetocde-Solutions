public class Leetcode_1796 {
    public int secondHighest(String s) {
        int[] num = new int[10];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                num[s.charAt(i) - '0']++;
            }
        }
        boolean found = false;
        for (int i = num.length - 1; i >= 0; i--) {
            if (num[i] > 0) {
                if (found)
                    return i;
                else
                    found = true;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Leetcode_1796 obj = new Leetcode_1796(); 
        String input = "abc9d5";
        int result = obj.secondHighest(input); 
        System.out.println("Second highest digit in the string '" + input + "' is: " + result);
    }
}
