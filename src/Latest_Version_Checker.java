import java.util.Scanner;

public class Latest_Version_Checker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first Version");
		String ver1=input.nextLine();
		System.out.println("Enter the second Version");
		String ver2=input.nextLine();
		String ver1_array[]=ver1.split("\\.");
		String ver2_array[]=ver2.split("\\.");
		int len=0;
		if(ver1_array.length>ver2_array.length){
			len=ver1_array.length;
		}
		else{
			len=ver2_array.length;
		}
		for(int i=0;i<len;i++){
			if(Integer.parseInt(ver1_array[i])>Integer.parseInt(ver2_array[i])){
				System.out.println("Version: "+ver1+" is the latest");
				break;
			}
			else if(Integer.parseInt(ver2_array[i])>Integer.parseInt(ver1_array[i])){
				System.out.println("Version: "+ver2+" is the latest");
				break;
			}
			else{
				continue;
			}
		}
		
	}

}
