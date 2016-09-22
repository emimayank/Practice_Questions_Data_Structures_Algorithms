
public class Linked_List_Circular_Check {
	public int val;
	public Linked_List_Circular_Check next;
	public Linked_List_Circular_Check(int val, Linked_List_Circular_Check next){
		this.val=val;
		this.next=next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linked_List_Circular_Check l1=new Linked_List_Circular_Check(1,null);
		Linked_List_Circular_Check l2=new Linked_List_Circular_Check(2,l1);
		Linked_List_Circular_Check l3=new Linked_List_Circular_Check(3,l2);
		Linked_List_Circular_Check l4=new Linked_List_Circular_Check(4,l3);
		l1.next=l4;
		Linked_List_Circular_Check temp=l1;
		Linked_List_Circular_Check start=l1.next;
		while(start!=null ){
			start=start.next;
			if(start==temp){
				break;
			}
		}
		if(start==null){
			System.out.println("Not Circular");
		}
		else{
			System.out.println("Circular");
		}
	}

}
