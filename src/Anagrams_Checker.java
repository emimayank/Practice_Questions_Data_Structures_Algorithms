import java.util.Arrays;
public class Anagrams_Checker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="12345";
		String str2="54361";
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1,ch2)){
			System.out.println("Anagrams");
		}
		else{
			System.out.println("Not Anagrams");
		}
	}

}
