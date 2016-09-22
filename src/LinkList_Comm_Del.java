import java.util.HashMap;

public class LinkList_Comm_Del {
	public int val;
	public LinkList_Comm_Del next;
	public LinkList_Comm_Del(int val, LinkList_Comm_Del next){
		this.val=val;
		this.next=next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList_Comm_Del l1= new LinkList_Comm_Del(1,null);
		LinkList_Comm_Del l2= new LinkList_Comm_Del(1,l1);
		LinkList_Comm_Del l3= new LinkList_Comm_Del(1,l2);
		LinkList_Comm_Del l4= new LinkList_Comm_Del(2,l3);
		LinkList_Comm_Del l5= new LinkList_Comm_Del(1,l4);
		LinkList_Comm_Del l6= new LinkList_Comm_Del(1,l5);
		HashMap<Integer,Integer>map=new HashMap<>();
		LinkList_Comm_Del prev=null,start=l6,temp=l6;
		int i=0;
		while(temp!=null){
			if(map.containsValue(temp.val)){
				prev.next=temp.next;
			}
			else{
				i++;
				map.put(i,temp.val);
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
