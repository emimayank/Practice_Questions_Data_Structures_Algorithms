import java.awt.DisplayMode;

public class Min_Heap_Insert_Delete_Display {
	public static int array[]={1,50,23,88,90,32,74,80};
	public static int heapsize;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<array.length;i++){
			insert(array[i]);
		}
		RemoveMin();
		DisplayHeap();
	}
	private static void DisplayHeap() {
		// TODO Auto-generated method stub
		for(int i=0;i<heapsize;i++){
			System.out.print(array[i]+" ");
		}
	}
	private static void RemoveMin() {
		// TODO Auto-generated method stub
		heapsize=array.length;
		array[0]=array[heapsize-1];
		heapsize--;
		ShiftDown(0);
		
	}
	private static void ShiftDown(int i) {
		// TODO Auto-generated method stub
		int left_child_index=0,right_child_index=0,min_index=0;
		left_child_index=(i*2)+1;
		right_child_index=(i*2)+2;
		if(left_child_index >=heapsize && right_child_index>=heapsize){
			return;
		}
		else{

			if(array[right_child_index]>array[left_child_index]){
				min_index=left_child_index;
			}
			else{
				min_index=right_child_index;
			}
			if(array[i]>array[min_index]){
				int temp=array[i];
				array[i]=array[min_index];
				array[min_index]=temp;
				ShiftDown(min_index);
			}
		}
	}
	private static void insert(int i) {
		// TODO Auto-generated method stub
		if(heapsize==0){
			array[heapsize++]=i;
			return;
		}
		else{
			array[heapsize++]=i;
			heapify(array[heapsize-1],heapsize-1);
			
		}

	}
	private static void heapify(int element, int position) {
		// TODO Auto-generated method stub
		int index_parent=position/2;
		if(array[index_parent]>element){
			int temp=element;
			array[position]=array[index_parent];
			array[index_parent]=temp;
			heapify(array[index_parent], index_parent);
			
		}
	}


	

}
