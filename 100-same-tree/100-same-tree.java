class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        String str1 = recursion(p);
        String str2 = recursion(q);
        
        return str1.equals(str2);
    }
    
    public static String recursion(TreeNode node) {
        if(node == null) {
            return "null";
        } else {
            return  "" + node.val + "" + recursion(node.left) + "" + recursion(node.right);
        }
    }
}