
/*public class Successor_BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node=findSuccessor(node);
	}
	public TreeNode findSuccessor(TreeNode node){
		if(node.right!=null){
			TreeNode result=rightSmallest(node.right);
		}
		else{
			TreeNode result=ancestorSuccessor(node);
		}
		return result;
	}
	public TreeNode rightSmallest(Treenode node){
		while(node.left!=null){
			node=node.left
		}
		return node;
	}
	public TreeNode ancestorSuccessor(TreeNode node){
		TreeNode parent=node.parent;
		while(parent.left!=node){
			node=parent;
			parent=parent.node;
		}
		return parent;
	}
	
}*/
