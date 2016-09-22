import java.util.Scanner;

public class Data_Structure_Similar_BST {
	public String val;
	public int index;
	public Data_Structure_Similar_BST(String val,int index){
		this.val=val;
		this.index=index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value to be added");
		String str=input.nextLine();
		i=i*2+1;
		Data_Structure_Similar_BST l1=new Data_Structure_Similar_BST(str,i);
		System.out.println("Enter a value to be added");
		str=input.nextLine();
		i=+1;
		Data_Structure_Similar_BST l2=new Data_Structure_Similar_BST(str,i);
	}

}
