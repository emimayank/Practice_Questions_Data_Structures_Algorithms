import java.util.Scanner;

public class Number_in_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=input.nextInt();
		String str="";
		if(n<100){
			str=underHundered(n);
		}
		if(n<1000){
			str=underThousand(n);
		}
		if(n<100000){
			str=underLakh(n);
		}
		System.out.println(str);

		
	}

	private static String underLakh(int n) {
		// TODO Auto-generated method stub
		String str="";
		int x=n/1000;
		n=n%1000;
		str=underHundered(x);
		str=str+" "+"thousand"+" "+underThousand(n);
		return str;
	}

	private static String underThousand(int n) {
		// TODO Auto-generated method stub
		String str="";
		int x=n/100;
		n=n%100;
		str=underHundered(x);
		str=str+" "+"hundered";
		str=str+" "+underHundered(n);
		return str;
	}

	private static String underHundered(int n) {
		// TODO Auto-generated method stub
		String str="";
		if((n<=20)||(n<100 && (n%10)==0)){
			str=underTwenty(n);
		}
		else if(n<100){
			while(n>10){
				int x=n-(n%10);
				str=underTwenty(x);
				n=n%10;
				str=str+" "+underTwenty(n);
			}
			
		}
		return str;
	}

	private static String underTwenty(int n) {
		// TODO Auto-generated method stub
		String str="";
		switch(n){
		case 1:
			str="one";
			break;
		case 2:
			str="two";
			break;
		case 3:
			str="three";
			break;
		case 4:
			str="four";
			break;
		case 5:
			str="five";
			break;
		case 6:
			str="six";
			break;
		case 7:
			str="seven";
			break;
		case 8:
			str="eight";
			break;
		case 9:
			str="nine";
			break;
		case 10:
			str="ten";
			break;
		case 11:
			str="eleven";
			break;
		case 12:
			str="twelve";
			break;
		case 13:
			str="thirteen";
			break;
		case 14:
			str="fourteen";
			break;
		case 15:
			str="fifteen";
			break;
		case 16:
			str="sixteen";
			break;
		case 17:
			str="seventeen";
			break;
		case 18:
			str="eighteen";
			break;
		case 19:
			str="nineteen";
			break;
		case 20:
			str="twenety";
			break;
		case 30:
			str="thirty";
			break;
		case 40:
			str="fourty";
			break;
		case 50:
			str="fifty";
			break;
		case 60:
			str="sixty";
			break;
		case 70:
			str="seventy";
			break;
		case 80:
			str="eighty";
			break;
		case 90:
			str="ninety";
			break;
		}
		return str;
	}

}
