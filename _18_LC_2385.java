import java.util.*;
public class _18_LC_2385 {

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

  public static void main(String[] args) {
      // root = [1,5,3,null,4,10,6,9,2],
     TreeNode root=new TreeNode(1);
        TreeNode a=new TreeNode(5);
        TreeNode b=new TreeNode(3);
        root.left=a;
        root.right=b;

       
        TreeNode c=new TreeNode(4);
        a.right=c;
        
        TreeNode d=new TreeNode(10);
        TreeNode e=new TreeNode(6);
        b.left=d;
        b.right=e;

        TreeNode f=new TreeNode(9);
        TreeNode g=new TreeNode(2);
        c.left=f;
        c.right=g;


        int start=3;

      System.out.println(amountOfTime(root, start)); // Output=4;

  }


  public static int amountOfTime(TreeNode root, int start) {
        TreeNode node=getNode(root,start);
       HashMap<TreeNode,TreeNode> map=new HashMap<>();
       preOrder(root,map);
       // DFS

       Queue<TreeNode> q=new LinkedList<>();
       q.add(node);
       Map<TreeNode,Integer> infected=new HashMap<>();
       infected.put(node,0);

       while(q.size()>0){
        TreeNode temp=q.peek();
        int level=infected.get(temp);
        if(temp.left!=null && !infected.containsKey(temp.left)){
            q.add(temp.left);
            infected.put(temp.left,level +1);
        }

        if(temp.right!=null && !infected.containsKey(temp.right)){
            q.add(temp.right);
            infected.put(temp.right,level +1);
        }

        if(map.containsKey(temp) && !infected.containsKey(map.get(temp))){
             q.add(map.get(temp));
            infected.put(map.get(temp),level +1);
        }
        q.remove();
       }

       int max=-1;
       for(int level: infected.values()){
        max=Math.max(max,level);
       }
      
      return max;
    }

    public static TreeNode getNode(TreeNode root, int start){
        if(root==null) return null;
        if(root.val==start) return root;
        TreeNode left=getNode(root.left,start);
        TreeNode right=getNode(root.right,start);
        if(left==null) return right;
        else return left;
    }

   public static void preOrder (TreeNode root,HashMap<TreeNode,TreeNode> map ){
        if(root==null) return;
        if(root.left!=null) map.put(root.left,root);
        if(root.right!=null) map.put(root.right,root);
        preOrder(root.left,map);
        preOrder(root.right,map);
   }

    
}
