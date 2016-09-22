import java.util.Scanner;

public class Angle_between_Clock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Hour");
		int h=input.nextInt();
		System.out.println("Enter the Minute");
		int m=input.nextInt();
		int angle=((11*m/2)-30*h);
		if(angle<0){
			angle=angle*-1;
		}
		System.out.println("The angle is: "+angle);
	}

}
