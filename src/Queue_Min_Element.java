import java.util.Scanner;

public class Queue_Min_Element {
	public static int queue[]=new int[100];
	public static int ptr=0,maxVal=0,head=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int val=0,x=0;
		while(val!=-1){
			System.out.println("Enter a value for the queue");
			val=input.nextInt();
			if(val>maxVal){
				maxVal=val;
			}
			Enqueue(val);
			x=Dequeue();

		}
		System.out.println("Dequeued Element: "+x);
		System.out.println("Maximum Element: "+maxVal);
	}
	private static int Dequeue() {
		// TODO Auto-generated method stub
		return queue[head++];
	}
	private static void Enqueue(int val) {
		// TODO Auto-generated method stub
		queue[ptr++]=val;
	}

}
