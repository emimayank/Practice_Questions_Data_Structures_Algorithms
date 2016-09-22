
public class Reverse_Words_Sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello how are you",output="";
		String array[]=str.split(" ");
		for(int i=0;i<array.length;i++){
			String temp=reverseWord(array[i]);
			output=output+temp+" ";
		}
		System.out.println(output);
	}

	private static String reverseWord(String string) {
		// TODO Auto-generated method stub
		String result="";
		for(char ch:string.toCharArray()){
			result=ch+result;
		}
		return result;
	}

}
