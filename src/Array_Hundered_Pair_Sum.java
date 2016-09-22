import java.util.HashMap;

public class Array_Hundered_Pair_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={23,82,9,0,100,1,99,16,76,24,50,50};
		HashMap<Integer,Integer>map=new HashMap<>();
		int fifty=0;
		for(int i=0;i<arr.length;i++){
			/*if(map.containsValue(100-arr[i])){
				map.put(i,arr[i]);
			}*/
			//if(!map.containsValue(50)){
				map.put(i,arr[i]);
				if(arr[i]==50){
					fifty++;
				}
			//}

		}
		for(int i=0;i<arr.length;i++){
			if(map.containsValue(100-arr[i]) && fifty!=2 && arr[i]!=50){
				System.out.println(arr[i]);
			}
			else if(fifty>1 &&arr[i]==50){
				System.out.println(50);
			}
		}
		
	}

}
