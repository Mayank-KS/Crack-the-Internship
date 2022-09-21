class Solution {
    public int sum(int num1, int num2) {
        if (num2 == 0)
            return num1;
        
        if (num1 < 0 && num2 < 0)
            return ~sum(sum(~num1 ^ ~num2, (~num1 & ~num2) << 1), 1);
        else
            return sum(num1 ^ num2, (num1 & num2) << 1);
    }
}