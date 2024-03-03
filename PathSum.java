/*112. Path Sum
Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
A leaf is a node with no children.
Example 1:
Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
Output: true
Explanation: The root-to-leaf path with the target sum is shown.

Example 2:
Input: root = [1,2,3], targetSum = 5
Output: false
Explanation: There two root-to-leaf paths in the tree:
(1 --> 2): The sum is 3.
(1 --> 3): The sum is 4.
There is no root-to-leaf path with sum = 5. */

/*Approach:
To solve this problem, we can use a recursive approach. We'll traverse the tree from the root to the leaf nodes. At each node, we'll subtract the node's value from the target sum and pass it down recursively to its children until we reach a leaf node. At the leaf node, if the remaining target sum equals the leaf node's value, we return true; otherwise, we return false. We'll perform this recursively for each subtree until we find a path satisfying the condition or exhaust all paths.

Steps to solve the problem:

1. Implement a recursive function to traverse the tree from the root to the leaf nodes.
2. At each node, subtract the node's value from the target sum.
3. Recur for the left and right subtrees with the updated target sum.
4. If a leaf node is reached, check if the remaining target sum equals the leaf node's value.
5. Return true if a path with the target sum is found, otherwise return false.
 */

 public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        //invalid case
        if(root == null)return false;

        //if node is a leaf node
        if(root.left == null && root.right == null && targetSum - root.val == 0){
            return true;
        }

        //step1: recursive call 
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
        
    }
}
