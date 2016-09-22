import java.util.Scanner;

public class Number_Conversion_to_any_Base {
	public static void main(String ars[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number to be converted");
		int num=input.nextInt();
		//System.out.println();

		System.out.println("Enter the base to which it has to be converted");
		int base=input.nextInt();
		String temp="";
		while(num!=0){
			temp=(num%base)+temp;
			num=num/base;
		}
		System.out.print(temp);


	}
}
