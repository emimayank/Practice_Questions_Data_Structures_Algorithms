
public class Fibonacci_Number_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=50;
		FindFibonacci(50);
	}

	private static void FindFibonacci(int n) {
		// TODO Auto-generated method stub
		int num1=0,num2=0;
		if(n==1){
			System.out.println(0);
		}
		else{
			System.out.println(0);
			num1=0;
			num2=1;
			n--;
			while(n!=0){
				int temp=num2;
				num2=num1+num2;
				num1=temp;
				System.out.println(num2);
				n--;	
			}
		}
		
	}



}
