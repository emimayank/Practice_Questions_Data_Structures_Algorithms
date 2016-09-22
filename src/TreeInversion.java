
/*public class TreeInversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	   public TreeNode invertTree(TreeNode root) {
	        if(root==null){
	            return null;
	        }
	        TreeNode start=root;
	        doTraverse(root);
	        return start;
	    }
	    public void doTraverse(TreeNode root){
	        if(root!=null){
	            doTraverse(root.left);
	            TreeNode temp=root.left;  

	            doTraverse(root.right);
	            root.left=root.right;
	            root.right=temp;
	        }
	    }

}*/
