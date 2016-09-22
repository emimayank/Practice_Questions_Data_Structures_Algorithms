
public class Pancake_Sort_zero_to_i {
	public static int arr[]={19,23,6,15,45,30,99,14};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max=0,index=0,len=arr.length;
		for(int j=0;j<arr.length;j++){
			max=0;
			for(int i=0;i<arr.length-j;i++){
				if(arr[i]>max){
					max=arr[i];
					index=i;
				}
			}
			//index=7;
			flip(0,index);//flipping from index zero to maxElement index
			flip(0,--len);//flipping so that max element comes in the end
		}

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	private static void flip(int start, int index) {
		// TODO Auto-generated method stub
		int temp=0;
		//int len=arr.length-1;
		for(int i=0;i<=index/2;i++){
			temp=arr[i];
			arr[i]=arr[index-i];
			arr[index-i]=temp;
		}
	}

}
