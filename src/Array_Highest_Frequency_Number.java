import java.util.HashMap;

public class Array_Highest_Frequency_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]={8,7,1,3,5,2,3,2,6,2,8,9,10,4,6,2,8,8,8,8,8};
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<num.length;i++){
			if(map.containsKey(num[i])){
				int count=map.get(num[i]);
				//map.remove(num[i]);
				count++;
				map.put(num[i],count);
			}
			else{
				map.put(num[i],1);
			}
		}
		int maxNumber=0,maxValue=0;
		for(Integer key:map.keySet()){
			if(map.get(key)>maxValue){
				maxNumber=key;
				maxValue=map.get(key);
			}
		}
		System.out.println("Maximum Frequency Number "+maxNumber+"  Frequency: "+maxValue);
	}

}
