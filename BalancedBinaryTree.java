/*110. Balanced Binary Tree
Given a binary tree, determine if it is height-balanced.

Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: true

Example 2:
Input: root = [1,2,2,3,3,null,null,4,4]
Output: false

Example 3:
Input: root = []
Output: true
  */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        //base case: if tree is empty -> balanced tree
        if(root == null){
            return true;
        }

        //functions to check height of lft and rht subtrees
        int left_height = height(root.left);
        int right_height = height(root.right);

        if(Math.abs(left_height - right_height) > 1){
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);        
    }

    //function to calculate height
    private int height(TreeNode node){
        //base case
        if(node == null){
            return 0;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    } 
}
