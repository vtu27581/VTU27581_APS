import java.util.*;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        
        dfs(root, "", result);
        
        return result;
    }

    private void dfs(TreeNode node, String path, List<String> result) {
        if (node == null) {
            return;
        }

        // Add current node to path
        if (path.equals("")) {
            path = String.valueOf(node.val);
        } else {
            path = path + "->" + node.val;
        }

        // If leaf node, add path to result
        if (node.left == null && node.right == null) {
            result.add(path);
            return;
        }

        // Visit left and right children
        dfs(node.left, path, result);
        dfs(node.right, path, result);
    }
}