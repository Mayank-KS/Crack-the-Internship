class Solution {
    public int mostWordsFound(String[] sentences) {
        int len=sentences.length;
        int max=0;
        for(int i=0;i<len;i++)
        {
            int c=0;
            String temp=sentences[i].trim();
            while(temp!=null)
            {
                int index=temp.indexOf(" ");
                if(index==-1) {
                    c++;
                    break;
                }
                temp=temp.substring(index+1,temp.length());
                c++;
            }
            if(c>max) max=c;
        }
        return max;
    }
}