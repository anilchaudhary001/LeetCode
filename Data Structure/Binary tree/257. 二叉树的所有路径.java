/**
给你一个二叉树的根节点 root ，按 任意顺序 ，返回所有从根节点到叶子节点的路径。

叶子节点 是指没有子节点的节点。

 
示例 1：


输入：root = [1,2,3,null,5]
输出：["1->2->5","1->3"]
示例 2：

输入：root = [1]
输出：["1"]
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


/**
// first edit
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<String>();
        constructPaths(root, "", paths);
        return paths;
    }

    public void constructPaths(TreeNode root, String path, List<String> paths) {
        if (root != null) {
            StringBuffer pathSB = new StringBuffer(path);
            pathSB.append(Integer.toString(root.val));
            if (root.left == null && root.right == null) {  // 当前节点是叶子节点
                paths.add(pathSB.toString());  // 把路径加入到答案中
            } else {
                pathSB.append("->");  // 当前节点不是叶子节点，继续递归遍历
                constructPaths(root.left, pathSB.toString(), paths);
                constructPaths(root.right, pathSB.toString(), paths);
            }
        }
    }
}

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
