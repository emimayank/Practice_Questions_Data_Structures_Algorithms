import java.util.Arrays;
import java.util.HashMap;

public class Top_3_most_Frequent_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="mayank shekhar anand mayank gupta anurag mayank shekhar anand mayank raja shekhar";
		HashMap<String,Integer>map=new HashMap<>();
		String str_array[]=str.split(" ");
		Arrays.sort(str_array);
		int count=1;
		for(int i=0;i<str_array.length-1;i++){
			if(str_array[i].equals(str_array[i+1])){
				count++;
			}
			else{
				map.put(str_array[i],count);
				count=1;
			}
		} 
		int max=0;
		String maxString="";
		for(String key:map.keySet()){
			if(map.get(key)>max){
				max=map.get(key);
				maxString=key;
			}
				
		}
		System.out.println(maxString);

	}

}
