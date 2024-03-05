public class Leetcode_997 {
    public static int findJudge(int n, int[][] trust) {
        int[] get_trust = new int[n+1];
        int[] give_trust = new int[n+1];

        for(int temp[] : trust){
            give_trust[temp[0]]++;
            get_trust[temp[1]]++;
        }

        for(int i=1;i<=n;i++){
            if(give_trust[i] == 0 && get_trust[i] == n-1)   return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        // Example input
        int n = 4;
        int[][] trust = {{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};

        // Call the method
        int result = findJudge(n, trust);

        // Output the result
        System.out.println("The judge is: " + result);
    }
}
