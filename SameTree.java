/*100. Same Tree
Given the roots of two binary trees p and q, write a function to check if they are the same or not.
Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

Example 1:
Input: p = [1,2,3], q = [1,2,3]
Output: true

Example 2:
Input: p = [1,2], q = [1,null,2]
Output: false */
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(){}
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
           //base case: if both trees are null -> reuturns true
           if(p == null && q == null){
               return true;
           }
   
           //when either one of them is null
           if(p == null || q == null){
               return false;
           }
   
           //if value of two nodes are not equal
           if(p.val != q.val){
               return false;
           }
   
           //recursive call to check all the nodes of left and rigtht subtree
           return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
           
    }
}
