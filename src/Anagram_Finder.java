import java.util.Scanner;
public class Anagram_Finder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=input.nextLine(),subStr="";
		for(char ch1:str.toCharArray()){
			subStr=new String("");
			for(char ch2:str.toCharArray()){
				if(ch1!=ch2){
					subStr=subStr+ch2;
				}
			}
			for(int i=0;i<=subStr.length();i++){
				StringBuilder str_bdr=new StringBuilder(subStr);
				str_bdr.insert(i,ch1);
				System.out.println(str_bdr.toString());
				str_bdr=new StringBuilder(subStr);
			}
		
		}
/*		StringBuilder s = new StringBuilder("Tutorial");
		   System.out.println("string = " + s);
		        
		   // insert character value at offset 8
		   s.insert(0, 's');
		        
		   // prints StringBuilder after insertion
		   System.out.print("After insertion = ");
		   System.out.println(s.toString());*/
	}

}
