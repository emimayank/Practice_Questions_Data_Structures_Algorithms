
public class Array_Sorted_Union {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1[]={1,3,7,8,11,12};
		int num2[]={0,3,4,7,8,9,13};
		int len1=0,len2=0;
		
		while(len1!=num1.length-1 && len2!=num2.length-1){
			if(num1[len1]<num2[len2]){
				System.out.println(num1[len1++]);
			}
			else if(num1[len1]>num2[len2]){
				System.out.println(num2[len2++]);
			}
			else{
				System.out.println(num1[len1++]);
				len2++;
			}
		}
		while(len1<num1.length-1){
			System.out.println(num1[len1++]);
		}
		while(len2<num2.length-1){
			System.out.println(num2[len2++]);
		}

	}

}
