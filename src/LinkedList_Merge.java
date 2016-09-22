
public class LinkedList_Merge {
	public int val;
	public LinkedList_Merge next;
	public LinkedList_Merge(int val, LinkedList_Merge next){
		this.val=val;
		this.next=next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList_Merge l1=new LinkedList_Merge(6,null);
		LinkedList_Merge l2=new LinkedList_Merge(5,l1);
		LinkedList_Merge l3=new LinkedList_Merge(1,l2);
		
		LinkedList_Merge m1=new LinkedList_Merge(7,null);
		LinkedList_Merge m2=new LinkedList_Merge(3,m1);
		LinkedList_Merge m3=new LinkedList_Merge(2,m2);
		
		LinkedList_Merge lptr=l3;
		LinkedList_Merge start=new LinkedList_Merge(0,null);
		LinkedList_Merge mptr=m3,head=start;
		while(lptr!=null && mptr!=null){
			if(lptr.val<mptr.val){
				start.next=lptr;
				lptr=lptr.next;
			}
			else{
				start.next=mptr;
				mptr=mptr.next;
			}
			start=start.next;
		}
		if(mptr!=null){
			start.next=mptr;
		}
		else{
			start.next=lptr;
		}
		head=head.next;
		while(head!=null){
			System.out.println(head.val);
			head=head.next;
		}
	}

}
