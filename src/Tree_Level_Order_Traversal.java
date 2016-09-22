import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class Tree_Level_Order_Traversal {
	public int data;
	public Tree_Level_Order_Traversal left;
	public Tree_Level_Order_Traversal right;
	public Tree_Level_Order_Traversal(int data, Tree_Level_Order_Traversal left, Tree_Level_Order_Traversal right){
		this.data=data;
		this.left=left;
		this.right=right;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree_Level_Order_Traversal l1= new Tree_Level_Order_Traversal(1,null,null);
		Tree_Level_Order_Traversal l2= new Tree_Level_Order_Traversal(2,null,null);
		Tree_Level_Order_Traversal l3= new Tree_Level_Order_Traversal(3,null,null);
		Tree_Level_Order_Traversal l4= new Tree_Level_Order_Traversal(4,null,null);
		Tree_Level_Order_Traversal l5= new Tree_Level_Order_Traversal(5,null,null);
		Tree_Level_Order_Traversal l6= new Tree_Level_Order_Traversal(6,null,null);
		Tree_Level_Order_Traversal l7= new Tree_Level_Order_Traversal(7,null,null);
		Tree_Level_Order_Traversal l8= new Tree_Level_Order_Traversal(8,null,null);
		l1.left=l2;
		l1.right=l3;
		l2.left=l4;
		l2.right=l5;
		l3.left=l6;
		l3.right=l7;
		l4.left=l8;
		Level_Traversal(l1);
	}
	public static void Level_Traversal(Tree_Level_Order_Traversal root){
		Queue<Tree_Level_Order_Traversal>queue=new LinkedList<Tree_Level_Order_Traversal>();
		queue.add((Tree_Level_Order_Traversal) root);
		while(!queue.isEmpty()){
			Tree_Level_Order_Traversal temp=queue.poll(); 
			System.out.println(temp.data);
			if(temp.left!=null){
				queue.add(temp.left);
			}
			if(temp.right!=null){
				queue.add(temp.right);
			}
		}
	}

}
