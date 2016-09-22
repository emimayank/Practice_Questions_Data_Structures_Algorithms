
/*public class In_Order_Successor {
	public void inOrder(TreeNode node){
		if(node.right!=null){
			minVal_right(node.right);//if right child exists then successor is the smallest value on the right side
									// which is the leftmost node on the right side!
		}
		else{
			minVal_ancestor(node.parent);//for no right child successor is the ancestor which is the left child 
										//of it's parent!
		}
	}
	public void minVal(TreeNode node){
		while(node.left!=null){
			node=node.left;
		}
		return node;
		
	}
	public void minVal_ancestor(TreeNode node){
		TreeNode p=node.parent;
		while(p.left!=node){
			p=p.parent;
			node=p;
		}
		return p;
	}
	
}	
*/