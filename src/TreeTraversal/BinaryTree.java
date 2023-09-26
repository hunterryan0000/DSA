package TreeTraversal;

// Class definition for operations on a binary tree
public class BinaryTree {

    // Method for in-order traversal of a binary tree
    public void inorderTraversal(TreeNode root) {

        // Check if the current node is null (base case)
        if (root != null) {

            // Traverse the left subtree
            inorderTraversal(root.left);

            // Visit the current node and print its value
            System.out.println(root.val);

            // Traverse the right subtree
            inorderTraversal(root.right);
        }
    }
}
