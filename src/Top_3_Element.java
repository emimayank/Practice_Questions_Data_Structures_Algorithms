
public class Top_3_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={99,1,333,44,87,9,403,88,11,34};
		//int mid=arr.length/2;
		int last=arr.length-1;
		int sort_arr[]=MergeSort(arr,0,last);
		for(int i=0;i<sort_arr.length;i++){
			System.out.println(sort_arr[i]);
		}
	}

	private static int[] MergeSort(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		int result[]=new int[arr.length];
		if(start<end){
			int mid=(start+end)/2;
			int l[]=MergeSort(arr,start,mid);
			int r[]=MergeSort(arr,mid+1,end);
			result=Merge(l,r,start,mid,end);
		}
		return result;
	}

	private static int[] Merge(int[] l, int[] r, int start, int mid, int end) {
		// TODO Auto-generated method stub
		int result[]=new int[(l.length+r.length)],len=0,i=0,lptr=0,rptr=0;
		if(l.length>r.length){
			len=l.length;
		}
		else{
			len=r.length;
		}
		while(i!=len){
			if(l[i]<r[i]){
				result[i++]=l[lptr++];
			}
			else{
				result[i++]=r[rptr++];
			}
		}
		while(lptr<l.length-1){
			result[i++]=l[lptr++];
		}
		while(rptr<r.length-1){
			result[i++]=l[rptr++];
		}
		return result;
	}

}
