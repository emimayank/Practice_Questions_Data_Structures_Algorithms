import java.util.Arrays;

public class Array_Odd_Number_Occurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,7,6,9,0,1,2,3,5,33,12,2,5,18,1,33},counter=1;
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]==arr[i+1]){
				counter++;
			}
			else{
				if(counter%2==1){
					System.out.println(arr[i]);
				}
				counter=1;
			}
		}
	}

}
