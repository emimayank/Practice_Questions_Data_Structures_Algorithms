import java.util.HashMap;
import java.util.HashSet;

public class String_Remove_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="lkpccofabfgkplbfc";
		HashMap<String,Integer>map=new HashMap<>();
		for(char ch:str.toCharArray()){
			map.put(ch+"",0);
		}
		System.out.println(map);
	}

}
