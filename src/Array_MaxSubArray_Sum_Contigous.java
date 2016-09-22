
public class Array_MaxSubArray_Sum_Contigous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={-2, -3, 4, -1, -2, 1, 5, -3};
		int size=a.length;
		int max_so_far = 0, max_ending_here = 0;
		 
	    for (int i = 0; i < size; i++)
	    {
	        max_ending_here = max_ending_here + a[i];
	        if (max_ending_here < 0)
	            max_ending_here = 0;
	        if (max_so_far < max_ending_here)
	            max_so_far = max_ending_here;
	    }
		System.out.println(max_so_far);
	}


}
