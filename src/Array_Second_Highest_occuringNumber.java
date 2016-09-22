import java.util.Arrays;

public class Array_Second_Highest_occuringNumber {
	public static void main(String args[]){
		int nums[]={2,7,8,9,2,1,3,0,1,4,1,5,1,2,2,2,2};
		Arrays.sort(nums);
		int maxOccur=1,smaxOccur=1,maxVal=0,smaxVal=1,count=1;
		for(int i=0;i<nums.length-1;i++){
			if(nums[i]==nums[i+1]){
				count++;
			}
			else{
				if(count>maxOccur){
					smaxOccur=maxOccur;
					smaxVal=maxVal;
					maxVal=nums[i-1];
					maxOccur=count;
				}
				else if(count>smaxOccur){
					smaxOccur=count;
					smaxVal=nums[i-1];
				}
				count=1;
			}
		}
		System.out.println(smaxVal+" "+smaxOccur);
	}
}
