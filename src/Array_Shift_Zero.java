
public class Array_Shift_Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]={1,0,0,2,0,7,5,6,0,8,0};
		int nums2[]=new int[nums.length],count=0,zeroCount=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=0){
				nums2[count++]=nums[i];
			}
			else{
				zeroCount++;
			}
		}
		for(int i=1;i<zeroCount;i++){
			nums2[count+i]=0;
		}
		for(int i=0;i<nums2.length;i++){
			System.out.print(nums2[i]+" ");
		}
	}

}
