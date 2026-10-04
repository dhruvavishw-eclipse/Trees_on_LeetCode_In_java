import java.util.*;
public class _15_LC_113_Path_Sum_II {

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

    public static void main(String [] RCB){
      
        // root = [5,4,8,11,null,13,4,7,2,null,null,5,1]

         TreeNode root=new TreeNode(5);
        TreeNode a=new TreeNode(4);
        TreeNode b=new TreeNode(8);
        root.left=a;
        root.right=b;

        TreeNode c=new TreeNode(11);
        a.left=c;

        TreeNode d=new TreeNode(13);
        TreeNode e=new TreeNode(4);
        b.left=d;
        b.right=e;

        TreeNode f=new TreeNode(7);
        TreeNode g=new TreeNode(2);
        c.left=f;
        c.right=g;

        TreeNode h=new TreeNode(5);
        TreeNode i=new TreeNode(1);
        e.left=h;
        e.right=i;

        int targetSum=22;

        System.out.println(pathSum(root, 22)); // Output: [[5,4,11,2],[5,8,4,5]]
    }


    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();

        helper(ans,arr,root,targetSum);
        return ans;
    }



     public static void helper( List<List<Integer>> ans,  List<Integer> arr,TreeNode root, int targetSum){
        if(root==null) return ;
        if(root.left==null && root.right==null){
            arr.add(root.val);
            if(root.val==targetSum){
                List<Integer> a=new ArrayList<>();
                for(int i=0;i<arr.size();i++){
                    a.add(arr.get(i));
                }
                ans.add(a);
            }
            arr.remove(arr.size()-1); // Backtracking 
            return;
        }
        arr.add(root.val);
         helper(ans,arr,root.left,targetSum-root.val);
          helper(ans,arr,root.right,targetSum-root.val);
          arr.remove(arr.size()-1); // Backtracking 
    }



}
