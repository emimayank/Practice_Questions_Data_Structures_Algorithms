
public class LinkedList_Delete_Value_Based {
	public int val;
	public LinkedList_Delete_Value_Based next;
	public LinkedList_Delete_Value_Based(int val, LinkedList_Delete_Value_Based next){
		this.val=val;
		this.next=next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList_Delete_Value_Based l1= new LinkedList_Delete_Value_Based(1,null);
		LinkedList_Delete_Value_Based l2= new LinkedList_Delete_Value_Based(2,l1);
		LinkedList_Delete_Value_Based l3= new LinkedList_Delete_Value_Based(1,l2);
		LinkedList_Delete_Value_Based l4= new LinkedList_Delete_Value_Based(2,l3);
		LinkedList_Delete_Value_Based l5= new LinkedList_Delete_Value_Based(1,l4);
		LinkedList_Delete_Value_Based l6= new LinkedList_Delete_Value_Based(1,l5);
		LinkedList_Delete_Value_Based prev=null,start=l6,temp=l6;
		int n=1;
		while(temp!=null){
			if(temp.val==n && prev!=null){
				prev.next=temp.next;
			}
			else if(prev==null &&temp.val==n){
				start=start.next;
			}
			else{
				prev=temp;
			}
			temp=temp.next;
		}
		while(start!=null){
			System.out.print(start.val+"->");
			start=start.next;
		}
	}

}
