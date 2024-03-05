class Leetcode_2965 {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] count = new int[n * n + 1]; 
        int repeated = 0;
        int missing = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count[grid[i][j]]++;
            }
        }

        for (int i = 1; i <= n * n; i++) {
            if (count[i] == 0) {
                missing = i;
            } else if (count[i] == 2) {
                repeated = i;
            }
        }

        return new int[]{repeated, missing};
    }
}