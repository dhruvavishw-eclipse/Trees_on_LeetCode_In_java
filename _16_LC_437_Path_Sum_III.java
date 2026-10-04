import java.util.*;
public class _16_LC_437_Path_Sum_III {

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

         TreeNode root=new TreeNode(10);
        TreeNode a=new TreeNode(5);
        TreeNode b=new TreeNode(-3);
        root.left=a;
        root.right=b;

        TreeNode c=new TreeNode(3);
        TreeNode d=new TreeNode(2);
        a.left=c;
        a.right=d;

        TreeNode e=new TreeNode(11);
        b.right=e;

        TreeNode f=new TreeNode(3);
        TreeNode g=new TreeNode(-2);
        c.left=f;
        c.right=g;

        TreeNode h=new TreeNode(1);
        d.right=h;
      
        int targetSum = 8;

        System.out.println(pathSum(root, targetSum));
    }


     public static int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        int count =noOfPaths(root,targetSum);
        count+= (pathSum(root.left,targetSum) + pathSum(root.right,targetSum));
        return count;
    }
  
   public static int noOfPaths(TreeNode root, long targetSum){
      if(root==null) return 0;
      int count=0;
      if((long)root.val==targetSum) count++;

      return count + noOfPaths(root.left,targetSum-(long)root.val) + noOfPaths(root.right,targetSum-(long)root.val);
   }


}
