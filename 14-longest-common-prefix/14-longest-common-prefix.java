class Solution {
    public String longestCommonPrefix(String[] strs) {
        int l=strs.length;
        if(l==1)
            return strs[0];
        char temp=' ';
        int i,x=0,max=strs[0].length();
        for(i=0;i<l;i++)
            if(strs[i].length()<max)
                max=strs[i].length();
        if(max==0)
            return "";
        while(x<max)
        {
            temp=strs[0].charAt(x);
            for(i=1;i<l;i++)
            {
                char temp2=strs[i].charAt(x);
                if(temp2!=(temp))
                    return strs[0].substring(0,x);
            }
            x++;
        }
        if(x!=0)
            return strs[0].substring(0,max);
        return "";
    }
}