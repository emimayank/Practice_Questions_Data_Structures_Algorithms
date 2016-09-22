
public class Link_List_Reversal {
	public int val;
	public Link_List_Reversal next;
	public Link_List_Reversal(int val, Link_List_Reversal next){
		this.val=val;
		this.next=next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Link_List_Reversal l1=new Link_List_Reversal(1,null);
		Link_List_Reversal l2=new Link_List_Reversal(2,l1);
		Link_List_Reversal l3=new Link_List_Reversal(3,l2);
		Link_List_Reversal l4=new Link_List_Reversal(4,l3);
		Link_List_Reversal l5=new Link_List_Reversal(5,l4);
		Link_List_Reversal temp=l5;
		System.out.println("Original Linked List");
		while(temp!=null){
			System.out.println(temp.val);
			temp=temp.next;
		}
		Reversal(l5);
	}
	private static void Reversal(Link_List_Reversal l5) {
		// TODO Auto-generated method stub
		Link_List_Reversal prev=null;
		Link_List_Reversal curr=l5;
		Link_List_Reversal next=null;
		while(curr!=null){
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		System.out.println("Reversed Linked List");
		while(prev!=null){
			System.out.println(prev.val);
			prev=prev.next;
		}
	}

}
