
public class Reverse_Sentence_Words_intact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello World what is up",newStr="",temp="";
		for(char ch:str.toCharArray()){
			if(ch==' '){
				newStr=newStr+temp+" ";
				temp="";
			}
			else{
				temp=ch+temp;
			}
			
		}
		newStr=newStr+temp+" ";
		System.out.println(newStr);
	}

}
