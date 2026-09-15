import java.util.*;
public class _1_Implementation_Of_Tree {

    public static class Node {       
        int val;
        Node left;
        Node right;

        public Node(int val) {
           this.val=val;
        }
    }

    public static void display(Node root){
        if(root == null) return;
        System.out.print(root.val + "-> ");
        if(root.left!=null)  System.out.print(root.left.val+",");
        if(root.right!=null) System.out.print(root.right.val);
        System.out.println();
        display(root.left);
        display(root.right);
    }


    public static void main(String[] RCB) {
        Node root=new Node(10);
        Node a=new Node(2);
        Node b=new Node(3);
        root.left=a;
        root.right=b;

        Node c=new Node(4);
        Node d=new Node(5);
        a.left=c;
        a.right=d;

        Node e=new Node(6);
        Node f=new Node(2);

        b.left=e;
        b.right=f;
        System.out.println(root );
       
        display(root);
    }
}
