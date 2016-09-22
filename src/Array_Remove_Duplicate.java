import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Array_Remove_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]={81,33,72,1,88,7,9,81,6,5,6,7,90,7,1,21,32};
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the way in which you want this to be done 1 for HashSet any anything else for HashMap");
		int op=input.nextInt();
		if(op==1){
			doHashSetOne(nums);
		}
		else{
			doHashMapOne(nums);
		}
	}

	private static void doHashMapOne(int[] nums) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer>map=new HashMap<>();
		int nums2[]=new int[nums.length],count=0;
		for(int i=0;i<nums.length;i++){
			if(!map.containsValue(nums[i])){
				map.put(i,nums[i]);
				nums2[count++]=nums[i];
			}
		}
		for(int i=0;i<count;i++){
			System.out.print(nums2[i]+" ");
		}
		System.out.println("Size:"+count);
	}

	private static void doHashSetOne(int[] nums) {
		// TODO Auto-generated method stub
		HashSet<Integer>set=new HashSet<>();
		for(int i=0;i<nums.length;i++){
			set.add(nums[i]);
		}
		Integer temp[]=new Integer[set.size()];
		int nums2[]=new int[set.size()];
		set.toArray(temp);
		for(int i=0;i<set.size();i++){
			nums2[i]=temp[i];
		}
		for(int i=0;i<nums2.length;i++){
			System.out.println(nums2[i]);
		}
		System.out.println("Size:"+nums2.length);
	}

}
