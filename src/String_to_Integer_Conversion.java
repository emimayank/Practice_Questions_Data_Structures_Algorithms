import java.util.Scanner;

public class String_to_Integer_Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number please");
		String num=input.nextLine();
		int temp=0;
		for(char ch:num.toCharArray()){
			temp=temp*10+(ch-'0');
			
		}
		System.out.println(temp);
	}

}
