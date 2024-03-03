/*101. Symmetric Tree
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

Example 1:
Input: root = [1,2,2,3,4,4,3]
Output: true

Example 2:
Input: root = [1,2,2,null,3,null,3]
Output: false
  */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)return true; // empty tree is a symmetric tree

        return isMirror(root.left, root.right);        
    }

    private boolean isMirror(TreeNode node1, TreeNode node2){
        //cond1
        if(node1 == null && node2 == null)return true;

        //cond2: if either one of them is null
        if(node1 == null || node2 == null){
            return false;
        }

        //if values of both nodes are equal: then check for their left nd right child nodes
        boolean result = node1.val == node2.val && isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);

        return result;
    }
    
}
