
public class Recursive_String_Reverse {
	static String reverse = "";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Mayank";
		int len=str.length();
		String result=reverseString(str);
		System.out.println(result);
	}

    public static String reverseString(String str){
        
        if(str.length() == 1){
            return str;
        } else {
            reverse = reverse+str.charAt(str.length()-1)
                    +reverseString(str.substring(0,str.length()-1));
            return reverse;
        }
    }

	}


