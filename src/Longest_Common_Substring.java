
public class Longest_Common_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1="abcdaf";
		String input2="zbcdf";
		int t[][] =new int[input1.length()][input2.length()];
		String str="";
		for(int i=0;i<input1.length();i++){
			for(int j=0;j<input2.length();j++){
				if(input1.charAt(i)==input2.charAt(j)){
					if(i==0 &&j==0){
						t[i][j]=1;
						//str=str+input1.charAt(i);
					}
					else{
						t[i][j]=t[i-1][j-1]+1;
						//str=str+input1.charAt(i);
					}
	
				}
				else{
					t[i][j]=0;
				}
			}
		}
		int max=0,row=0,column=0;
		for(int i=0;i<input1.length();i++){
			for(int j=0;j<input2.length();j++){
				if(max<t[i][j]){
					max=t[i][j];
					row=i;
					column=j;
				}
			}
		}
		String str1="";
		while(t[row][column]!=0){
			str1=input1.charAt(row)+str1;
			row--;
			column--;
		}
		System.out.println(str1);
	}

}
