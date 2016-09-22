
public class Parse_String {
	public static int ptr=0;
	public static char stack[]=new char[100];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expr="(((a+b)*c))+d)/e";

		for(char ch:expr.toCharArray()){
			int ascii=(int)ch;
			if(ascii!=41){
				push(ch);
			}
			else{
				char ch_pop='\0';
				String e="";
				while((int)ch_pop!=40){
					e=ch_pop+e;
					ch_pop=pop();
				}
				System.out.println(e);
				push('E');
			}
		}
	}
	private static char pop() {
		// TODO Auto-generated method stub
		char ch_pop='\0';
		if(ptr!=0){
			ch_pop=stack[ptr--];
		}
		return ch_pop;

	}
	public static void push(char ch){
		stack[ptr++]=ch;
	}

}
