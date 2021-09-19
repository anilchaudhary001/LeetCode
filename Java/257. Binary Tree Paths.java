/**
Given the root of a binary tree, return all root-to-leaf paths in any order.

A leaf is a node with no children.

Example 1:
Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]

Example 2:
Input: root = [1]
Output: ["1"]
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

   List<String> res = new ArrayList<>();    // 存储结果
   LinkedList<String> path = new LinkedList<>();  // 存储单个路径

    public List<String> binaryTreePaths(TreeNode root) {
        traverse(root);
        return res;
    }

    // 二叉树的遍历框架
    public void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        // 前序遍历位置
        path.add(String.valueOf(root.val));
        // 到叶子节点就返回
        if (root.left == null && root.right == null) {
            // 添加到结果中
            res.add(String.join("->", path));
        }
        traverse(root.left);
        traverse(root.right);
        path.removeLast();
    }
}
