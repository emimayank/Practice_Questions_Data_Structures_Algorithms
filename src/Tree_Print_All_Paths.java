
public class Tree_Print_All_Paths {
	public int val;
	public Tree_Print_All_Paths left;
	public Tree_Print_All_Paths right;
	public Tree_Print_All_Paths(int val,Tree_Print_All_Paths right,Tree_Print_All_Paths left){
		this.val=val;
		this.left=left;
		this.right=right;
	}
	public static int path[]=new int[1000];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree_Print_All_Paths l1=new Tree_Print_All_Paths(10,null,null);
		Tree_Print_All_Paths l2=new Tree_Print_All_Paths(8,null,null);
		Tree_Print_All_Paths l3=new Tree_Print_All_Paths(2,null,null);
		Tree_Print_All_Paths l4=new Tree_Print_All_Paths(3,null,null);
		Tree_Print_All_Paths l5=new Tree_Print_All_Paths(5,null,null);
		Tree_Print_All_Paths l6=new Tree_Print_All_Paths(6,null,null);
		l1.left=l2;
		l1.right=l3;
		l2.left=l4;
		l2.right=l5;
		l3.left=l6;
		Find_Path(l1);
	}
	private static void Find_Path(Tree_Print_All_Paths l1) {
		// TODO Auto-generated method stub
		Recursive_Path_Trace(l1,path,0);
	}
	private static void Recursive_Path_Trace(Tree_Print_All_Paths l1, int[] path, int pathLen) {
		// TODO Auto-generated method stub
		if(l1==null){
			return;
		}
		path[pathLen]=l1.val;
		pathLen++;
		if(l1.right==null && l1.left==null){
			printPath(path,pathLen);
		}
		else{
			Recursive_Path_Trace(l1.left,path,pathLen);
			Recursive_Path_Trace(l1.right,path,pathLen);
		}
	}
	private static void printPath(int[] path, int pathLen) {
		// TODO Auto-generated method stub
		int i;
		for(i=0;i<pathLen;i++){
			System.out.print(path[i]+" ");
		}
		System.out.println(" ");
	}

}
