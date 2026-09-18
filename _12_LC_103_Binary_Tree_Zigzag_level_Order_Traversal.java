import java.util.*;
public class _12_LC_103_Binary_Tree_Zigzag_level_Order_Traversal {

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
        // root = [3,9,20,null,null,15,7]   Output=[[3], [20, 9], [15, 7]];

         TreeNode root=new TreeNode(3);
        TreeNode a=new TreeNode(9);
        TreeNode b=new TreeNode(20);
        root.left=a;
        root.right=b;

        TreeNode c=new TreeNode(15);
        TreeNode d=new TreeNode(7);
        b.left=c;
        b.right=d;

        System.out.println(zigzagLevelOrder(root));
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int level=height(root)+1;
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        for(int i=1;i<=level;i++){
            List<Integer> arr=new ArrayList<>();
            if(i%2!=0)  nTh1(root,i,arr);
            else  nTh2(root,i,arr);
            ans.add(arr);
        }
        return ans;
    }

    public static  int height(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0; 
        return 1+ Math.max(height(root.left),height(root.right));
    }
    

    public static void nTh1(TreeNode root,int n,List<Integer> arr){
        if(root==null) return;
        if(n==1){
            arr.add(root.val);
            return;
        }
        nTh1(root.left,n-1,arr);
        nTh1(root.right,n-1,arr);
    }



    public static void nTh2(TreeNode root,int n,List<Integer> arr){
        if(root==null) return;
        if(n==1){
            arr.add(root.val);
            return;
        }
        nTh2(root.right,n-1,arr);
        nTh2(root.left,n-1,arr);
    }

}
