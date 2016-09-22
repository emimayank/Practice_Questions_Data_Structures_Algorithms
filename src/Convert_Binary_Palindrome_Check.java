import java.util.Scanner;

public class Convert_Binary_Palindrome_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=input.nextInt();
		String bin="";
		while(num!=0){
			int val=num%2;
			bin=val+bin;
			num=num/2;			
		}
		int num2=Integer.parseInt(bin),temp=num2,num3=0;
		while(num2>0){
			int x=num2%10;
			num2=num2/10;
			num3=10*num3+x;

		}
		if(num3==temp){
			System.out.println("Palidrome");
		}
		else{
			System.out.println("Not Palidrome");
		}
	}

}
