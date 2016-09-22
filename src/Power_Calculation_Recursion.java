
public class Power_Calculation_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3,n=3;
		int val=findPow(a,n);
		System.out.println(val);
	}

	private static int findPow(int a, int n) {
		// TODO Auto-generated method stub
	    if(n == 0)
	        return 1;

	     else if(n % 2 == 0)
	        return a * a;

	     else
	        return a * findPow(a, n-1);
	}

}
