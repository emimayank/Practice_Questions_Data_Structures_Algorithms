
public class SubString_Finder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="abcdeifgh";
		String str2="efg";
		int x=0;
		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i)==str2.charAt(x)){
				x++;
				if(x==str2.length()){
					break;
				}
			}
			else{
				x=0;
			}
		}
		if(x!=0){
			System.out.println("Found");
		}
		else{
			System.out.println("Not Found");
		}
	}

}
