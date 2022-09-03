class Solution {
    public boolean isAnagram(String s, String t) {
        for(int i=0;i<t.length() && (s.length()+i)==t.length();i++)
            s = s.replaceFirst(Character.toString(t.charAt(i)),"");
        return s.isEmpty();
    }
}