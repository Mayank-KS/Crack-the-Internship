class Solution {
    public boolean checkDistances(String s, int[] distance) {
        for(int i=0;i<26;i++)
        {
            char c = (char)('a'+i);
            if(s.contains(String.valueOf(c)))
                if(s.lastIndexOf(c)-s.indexOf(c)-1!=distance[i])
                    return false;
        }
        return true;
    }
}