import java.util.*;
public class _19_LC_958_Check_Completeness_of_a_Binary_Tree {

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
    
    static int s;

    public static void main(String RCB []){
     // Input: root = [1,2,3,4,5,null,7]
        TreeNode root=new TreeNode(1);
        TreeNode a=new TreeNode(2);
        TreeNode b=new TreeNode(3);
        root.left=a;
        root.right=b;

        TreeNode c=new TreeNode(4);
        TreeNode d=new TreeNode(5);
        a.left=c;
        a.right=d;

        TreeNode e=new TreeNode(7);
        b.right=e;
      
        s=size(root);

       System.out.println(isCompleteTree(root));
       
    }

    
    public static  boolean isCompleteTree(TreeNode root) {
        s=size(root);

        return isCBT(root,1);
    }
   
    public static boolean isCBT(TreeNode root, int  idx){
        if(root==null) return true;
        if(idx>s) return false;
        
        return isCBT(root.left, 2*idx) && isCBT(root.right, 2 * idx +1);
    }


    public static int size(TreeNode root){
        if(root==null) return 0;
        return 1+ size(root.left) + size(root.right);
    }

}
