import java.util.Arrays;

public class Duplicated_Word_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello World I'm Morbo, how are you World";
		String str_array[]=str.split(" ");
		Arrays.sort(str_array);
		int count=1;
		for(int i=0;i<str_array.length-1;i++){
			if(str_array[i].equals(str_array[i+1])){
				count++;
			}
			else{
				if(count%2==0 && i>0){
					System.out.println(str_array[i-1]);
				}
				count=1;
			}
		}
	}

}
