class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<t.length();i++)
            s = s.replaceFirst(Character.toString(t.charAt(i)),"");
        return s.isEmpty();
    }
}