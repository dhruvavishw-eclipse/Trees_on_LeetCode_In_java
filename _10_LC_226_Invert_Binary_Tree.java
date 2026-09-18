import java.util.*;

import org.w3c.dom.Node;
public class _10_LC_226_Invert_Binary_Tree {

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


    public static void main(String RCB []) {
        // root = [4,2,7,1,3,6,9];

        TreeNode root=new TreeNode(4);
        TreeNode a=new TreeNode(2);
        TreeNode b=new TreeNode(7);
        root.left=a;
        root.right=b;

        TreeNode c=new TreeNode(1);
        TreeNode d=new TreeNode(3);
        a.left=c;
        a.right=d;

        TreeNode e=new TreeNode(6);
        TreeNode f=new TreeNode(9);

        b.left=e;
        b.right=f;

        // System.out.println(invertTree(root));
      mirror(root);
    }

    public static TreeNode invertTree(TreeNode root) {
        // This code is from LC and its method is TreeNode 
        // root = [4,2,7,1,3,6,9] ---> Output: [4,7,2,9,6,3,1];

        if(root==null) return root;
         TreeNode l=root.left;
         TreeNode r=root.right;
         root.left=invertTree(r);
         root.right=invertTree(l);
         return root;
        
    }

    
     public static  void mirror(TreeNode root) {
       // This is from GFG here method is void type
        // root = [4,2,7,1,3,6,9] ---> Output: [4,7,2,9,6,3,1];

        if(root==null) return ;        
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        
        mirror(root.left);
        mirror(root.right);
      
        
    }


}
