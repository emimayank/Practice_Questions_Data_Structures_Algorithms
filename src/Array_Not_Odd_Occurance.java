
public class Array_Not_Odd_Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]={2,1,3,7,3,7,3,7,2,5};

	    int i;
	    int res = num[0]; 
	    for (i=1; i < num.length; i++){
	    	res = res ^ num[i];
	    }
	    System.out.println(res);
	}

}
