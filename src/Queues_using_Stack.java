import java.awt.EventQueue;

public class Queues_using_Stack {
	public static int pointer1=1;
	public static int pointer2=0;
	public static int stack1[]=new int[1000];
	public static int stack2[]=new int[1000];
	public static void enqueue(int x){
		if(pointer1>=0){
			stack1[pointer1++]=x;
		}
	}
	public static int dequeue(){
		if(stack1[1]==0){
			return 0;
		}
		else{
			while(pointer1>0){
				stack2[pointer2++]=stack1[pointer1--];
			}
			int result=stack2[pointer2-1];
			pointer2=pointer2-1;
			while(pointer2>0){
				stack1[pointer1++]=stack2[pointer2--];
			}
			return result;

		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enqueue(2);
		enqueue(3);
		enqueue(4);
		enqueue(5);
		enqueue(6);
		enqueue(7);
		enqueue(8);
		int result=dequeue();
		int result2=dequeue();
		int result3=dequeue();
		int result4=dequeue();
		int result5=dequeue();
		int result6=dequeue();
		int result7=dequeue();
		enqueue(12);
		int result8=dequeue();
		System.out.println(result8);
	}

}
