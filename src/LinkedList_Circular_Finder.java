
public class LinkedList_Circular_Finder {
	public int val;
	public LinkedList_Circular_Finder next;
	public LinkedList_Circular_Finder(int val, LinkedList_Circular_Finder next){
		this.val=val;
		this.next=next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList_Circular_Finder l6=new LinkedList_Circular_Finder(6,null);
		LinkedList_Circular_Finder l5=new LinkedList_Circular_Finder(5,l6);
		LinkedList_Circular_Finder l4=new LinkedList_Circular_Finder(4,l5);
		LinkedList_Circular_Finder l3=new LinkedList_Circular_Finder(3,l4);
		LinkedList_Circular_Finder l2=new LinkedList_Circular_Finder(2,l3);
		LinkedList_Circular_Finder l1=new LinkedList_Circular_Finder(1,l2);
		l6.next=l2;
		LinkedList_Circular_Finder fast=l1,slow=l1,prev=null;
		while(slow!=null){
			prev=slow;
			slow=slow.next;
			fast=fast.next.next;
			if(fast==slow){
				break;
			}
		}
		System.out.println(slow.val+" "+prev.val);
	}

}
