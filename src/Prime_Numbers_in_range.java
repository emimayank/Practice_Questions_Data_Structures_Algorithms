
public class Prime_Numbers_in_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=63;
		for(int i=2;i<=63;i++){
			findPrime(i);
		}
	}

	private static void findPrime(int num) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=num;i++){
			if(num%i==0){
				count++;
			}
		}
		if(count==2){
			System.out.print(num+" ");
		}
	}

}
