import java.util.HashMap;

public class Frequent_Used_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="the problem is I don't know if I will need 10. I may need 8 or 12 or any other number for that matter. I won't know until runtime. Can I change the number of elements in an array on the fly? If so, how?";
		HashMap <String,Integer>map=new HashMap<>();
		String str_array[]=str.split(" ");
		for(String s:str_array){
			if(map.containsKey(s)){
				int k=map.get(s);
				map.remove(s);
				k++;
				map.put(s,k);
			}
			else{
				map.put(s,1);
			}
		}
		int maxVal=0;
		String maxString="";
		for(String key:map.keySet()){
			if(map.get(key)>maxVal){
				maxString=key;
				maxVal=map.get(key);
			}
		}
		System.out.println("Maximum Frequency Word: "+maxString+", Frequency: "+maxVal);
		
	}

}
