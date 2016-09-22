import java.util.HashMap;

public class First_Non_Reapting_Letter_inWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="GeeksforGeeks";
		HashMap<Character,Integer>map=new HashMap<>();
		for(char ch:str.toCharArray()){
			if(map.containsKey(ch)){
				int count=map.get(ch)+1;
				map.remove(ch);
				map.put(ch,count);
			}
			else{
				map.put(ch,1);
			}
		}
		System.out.println(map);
		for(char ch:str.toCharArray()){
			if(map.get(ch)==1){
				System.out.println(ch);
				break;
			}
		}
	}

}
