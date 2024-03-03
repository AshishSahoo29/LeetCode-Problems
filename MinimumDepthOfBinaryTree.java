/*111. Minimum Depth of Binary Tree
Given a binary tree, find its minimum depth.
The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
Note: A leaf is a node with no children.

Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: 2

Example 2:
Input: root = [2,null,3,null,4,null,5,null,6]
Output: 5 */


import java.util.*;
public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if(root == null)return 0; //base case

        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root); // add root node to queue
        int depth = 1;

        while(!que.isEmpty()){
            int size = que.size();

            //to traverse all the nodes at same level
            for(int i = 0; i < size; i++){
                TreeNode node = que.poll();

                //if a leaf node is encountered
                //it finds first ever leaf node 
                if(node.left == null && node.right == null){
                    return depth;
                }

                //add left children
                if(node.left != null){
                    que.offer(node.left);
                }

                //add right node
                if(node.right != null){
                    que.offer(node.right);
                }
            }
            depth++;
        }
        return depth;        
    }    
}
