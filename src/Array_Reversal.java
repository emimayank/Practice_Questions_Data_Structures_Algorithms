
public class Array_Reversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,4,7,1,9,0,2,5};
		int len=arr.length-1;
		for(int i=0;i<arr.length/2;i++){
			int temp=arr[i];
			arr[i]=arr[len];
			arr[len--]=temp;
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
	}

}
