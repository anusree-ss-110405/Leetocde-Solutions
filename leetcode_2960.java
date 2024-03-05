class Leetcode_2960 {
    public int countTestedDevices(int[] batteryPercentages) {
        int n=batteryPercentages.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(batteryPercentages[i]>0)
            {
                count++;
                for(int j=i+1;j<n;j++)
                {
                    batteryPercentages[j]=batteryPercentages[j]-1;
                }
            }
        }
        return count;
    }
}