
public class Tree_Traversal {
	public int val;
	public Tree_Traversal right;
	public Tree_Traversal left;
	public Tree_Traversal(int val, Tree_Traversal left,Tree_Traversal right){
		this.val=val;
		this.right=right;
		this.left=left;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree_Traversal l1=new Tree_Traversal(1,null,null);
		Tree_Traversal l2=new Tree_Traversal(2,null,null);
		Tree_Traversal l3=new Tree_Traversal(3,null,null);
		Tree_Traversal l4=new Tree_Traversal(4,null,null);
		Tree_Traversal l5=new Tree_Traversal(5,null,null);
		Tree_Traversal l6=new Tree_Traversal(6,null,null);
		Tree_Traversal l7=new Tree_Traversal(7,null,null);
		//Tree_Traversal l8=new Tree_Traversal(8,null,null);
		l1.left=l2;
		l1.right=l3;
		l2.left=l4;
		l2.right=l5;
		l3.left=l6;
		l3.right=l7;
		Tree_Traversal temp=l1;
		System.out.println("Inorder Traversal");
		inOrder(temp);
		System.out.println("Postorder Traversal");
		postOrder(temp);
		System.out.println("Preorder Traversal");
		preOrder(temp);
		
	}
	private static void preOrder(Tree_Traversal temp) {
		// TODO Auto-generated method stub
		if(temp!=null){
			System.out.println(temp.val);
			preOrder(temp.left);
			preOrder(temp.right);
		}
	}
	private static void postOrder(Tree_Traversal temp) {
		// TODO Auto-generated method stub
		if(temp!=null){
			postOrder(temp.left);
			postOrder(temp.right);
			System.out.println(temp.val);
		}
	}
	private static void inOrder(Tree_Traversal temp) {
		// TODO Auto-generated method stub
		if(temp!=null){
			inOrder(temp.left);
			System.out.println(temp.val);
			inOrder(temp.right);
		}

	}

}
