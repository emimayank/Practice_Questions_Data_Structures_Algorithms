import java.util.Scanner;

public class Square_Root_of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		double num=input.nextDouble();
		if(num<0){
			System.out.println("Number entered negetive");
		}
		else if(num ==0){
			System.out.println(0);
		}
		else{
			double n;
			double squareRoot = num/2;
	        do
	        {
	            n=squareRoot;
	            squareRoot = (n + (num/n))/2;
	        }
	        while((n-squareRoot)!=0);
	        System.out.println(squareRoot);
		}
	}

}
