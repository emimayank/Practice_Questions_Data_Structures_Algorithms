
public class Longest_Common_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1="rklsltrstk";
		String input2="pkrslstk";
		int t[][]=new int[input1.length()][input2.length()];
		for(int i=0;i<input1.length();i++){
			for(int j=0;j<input2.length();j++){
				if(input1.charAt(i)==input2.charAt(j)){
					t[i][j]=t[i-1][j-1]+1;
				}
				else{
					t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
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
		String str="";
		while(t[row][column]!=0){
			if(t[row][column]> t[row][column-1] && t[row][column]>t[row-1][column]){
				str=input1.charAt(row)+str;
				row--;
				column--;
			}
			else if(t[row-1][column]<t[row][column-1]){
				column--;
			}
			else{
				row--;
			}
		}
		System.out.println(str);
	}

}
