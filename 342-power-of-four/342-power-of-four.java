class Solution {
    public boolean isPowerOfFour(int n) {
        return Integer.bitCount(n) == 1 && (Integer.toBinaryString(n).length()-1)%2==0;
    }
}