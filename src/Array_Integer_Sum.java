import java.util.HashMap;

public class Array_Integer_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={1,2,3,5,8,9,4,16,32,11,21};
		HashMap<Integer, Integer>map=new HashMap<>();
		for(int i=0;i<array.length;i++){
			map.put(i,array[i]);
		}
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length;j++){
				int sum=array[i]+array[j];
				if(map.containsValue(sum)&& array[i]!=array[j]){
					System.out.println(array[i]+" "+array[j]+"="+sum);
				}
			}
		}
	}

}
