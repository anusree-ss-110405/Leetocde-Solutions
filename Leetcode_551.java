class Leetcode_551 {
    public boolean checkRecord(String s) {
        int absent=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='A')
            {
                absent++;
            }
        }
        if(absent>=2)
        {
            return false;
        }
        int i=0;
        while(i<n-2)
        {
            if(s.charAt(i)=='L')
            {
                if(s.charAt(i)==s.charAt(i+1) && s.charAt(i+1)==s.charAt(i+2))
                {
                    return false;
                }
            }
            i++;
        }
        return true;
    }
}