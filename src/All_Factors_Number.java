import java.util.Scanner;

public class All_Factors_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=input.nextInt();
		for(int i=1;i<n/2;i++){
			if(n%i==0){
				System.out.println(i);
			}
		}
	}

}
