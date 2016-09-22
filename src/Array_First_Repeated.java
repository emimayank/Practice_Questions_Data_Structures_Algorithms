import java.util.HashMap;

public class Array_First_Repeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]={1,3,2,8,6,2,1,9,0};
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<num.length;i++){
			if(map.containsValue(num[i])){
				System.out.println(num[i]);
				break;
			}
			else{
				map.put(i,num[i]);
			}
		}
	}

}
