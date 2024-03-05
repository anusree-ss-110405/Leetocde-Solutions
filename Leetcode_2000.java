class Leetcode_2000 {
    public String reversePrefix(String word, char ch) {
        int index=0;
        String after="";
        StringBuilder bef=new StringBuilder();
        for(int i=0;i<word.length();i++)
        {
          if(word.charAt(i)==ch)
          {
            index=i;
            break;
          }
        }
        for(int i=0;i<word.length();i++)
        {
          if(i>index)
          {
            after+=word.charAt(i);
          }
          else
          {
            bef.append(word.charAt(i));
          }
        }
        StringBuilder before= bef.reverse();
        String first=before.toString();
        String ans=first+after;
        return ans;
    }
}