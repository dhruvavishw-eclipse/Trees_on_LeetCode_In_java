import java.util.*;

import org.w3c.dom.Node;
public class _4_LC_543_Diameter_of_Binary_Tree {


    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }


    public static void main(String RCB []){
        TreeNode root=new TreeNode(1);
        TreeNode a=new TreeNode(2);
        TreeNode b=new TreeNode(3);
        root.left=a;
        root.right=b;

        TreeNode c=new TreeNode(4);
        TreeNode d=new TreeNode(5);
        a.left=c;
        a.right=d;

   System.out.println(diameterOfBinaryTree(root));
    }


     public static int height(TreeNode root){
        if(root==null ||(root.left==null && root.right==null))
        return 0;
        return 1+ Math.max(height(root.left),height(root.right));      
    }

    public static int diameterOfBinaryTree(TreeNode root) {
         if(root==null ||(root.left==null && root.right==null))
        return 0;
        int leftAns=diameterOfBinaryTree(root.left);
        int rightAns=diameterOfBinaryTree(root.right);
        int mid=(height(root.left) + height(root.right));
        if(root.left!=null) mid++;
        if(root.right!=null) mid++;
        return Math.max(leftAns,Math.max(rightAns,mid));

        
    }

}
