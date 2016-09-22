import java.util.Scanner;

public class LinkedList_K_Delete {
	public int val;
	public LinkedList_K_Delete next;
	public LinkedList_K_Delete(int val, LinkedList_K_Delete next){
		this.val=val;
		this.next=next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList_K_Delete l1=new LinkedList_K_Delete(1,null);
		LinkedList_K_Delete l2=new LinkedList_K_Delete(2,l1);
		LinkedList_K_Delete l3=new LinkedList_K_Delete(3,l2);
		LinkedList_K_Delete l4=new LinkedList_K_Delete(4,l3);
		LinkedList_K_Delete l5=new LinkedList_K_Delete(5,l4);
		LinkedList_K_Delete l6=new LinkedList_K_Delete(6,l5);
		LinkedList_K_Delete l7=new LinkedList_K_Delete(7,l6);
		LinkedList_K_Delete l8=new LinkedList_K_Delete(8,l7);
		LinkedList_K_Delete start=l8;
		int i=0;
		while(start!=null){
			i++;
			start=start.next;
		}
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value of K:");
		int k=input.nextInt();
		int del_element=i-k+1;
		LinkedList_K_Delete temp=l8;
		int del_node=1;
		while(del_node<del_element-1){
			temp=temp.next;
			del_node++;
		}
		temp.next=temp.next.next;
		while(l8!=null){
			System.out.println(l8.val);
			l8=l8.next;
		}
	}

}
