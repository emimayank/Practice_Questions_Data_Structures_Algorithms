import java.util.Scanner;

public class Excel_Title_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the index");
		int n=input.nextInt();
		StringBuilder sb = new StringBuilder();
        while(n!=0){   
        	n--;
            sb.insert(0,(char)('A' + n % 26));
            n/=26;
        }
        System.out.println(sb.toString());
	}

}
