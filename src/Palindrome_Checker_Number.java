
public class Palindrome_Checker_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1991,num2=0,counter=1,temp=num;
		while(num>0){
			int x=num%10;
			num=num/10;
			num2=10*num2+x;

		}
		if(num2==temp){
			System.out.println("Palidrome");
		}
		else{
			System.out.println("Not Palidrome");
		}
	}

}
