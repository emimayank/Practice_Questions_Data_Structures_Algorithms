import java.util.Scanner;

public class String_Compression_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = -1, count = 1;
		char temp = 0;
		String newString = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String");
		String string = input.nextLine();
		for (char ch : string.toCharArray()) {
			i = i + 1;
			if (i != (string.length() - 1)) {
				if (ch == string.charAt(i + 1)) {
					count = count + 1;
					temp=ch;
				} 
				else {
					if (count > 1) {
						newString = newString + ch + count;
						count = 1;
					} 
					else {
						newString = newString + ch;
					}
				}
			}

		}
		if (count!=1){
			newString=newString+temp+count;
		}
		else{
			newString=newString+temp;
		}

		System.out.println("Here is your Compressed String " + newString);
	}

}
