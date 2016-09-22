import java.util.HashMap;

public class Array_Duplicate_from_2_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer>map=new HashMap<>();
		int arr1[]={1,2,3,5,7,0,9,16};
		int arr2[]={16, 3,10,0,5,6,22};
		for(int i=0;i<arr1.length;i++){
			map.put(i,arr1[i]);
		}
		for(int i=0;i<arr2.length;i++){
			if(map.containsValue(arr2[i])){
				System.out.println(arr2[i]);
			}
		}
	}

}
