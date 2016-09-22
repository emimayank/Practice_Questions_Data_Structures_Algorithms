
public class Number_of_ones_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bin=1011101,count=0;
		while(bin!=0){
			if(bin%10==1){
				count++;
			}
			bin=bin/10;
		}
		System.out.println(count);
	}

}
