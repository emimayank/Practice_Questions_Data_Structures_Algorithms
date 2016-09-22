import java.util.Random;
import java.util.Scanner;

public class Kth_Order_Statistic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]={7,9,1,3,5,4,10,8,19,12,99,4,18};
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value of k");
		int k=input.nextInt();
		int result=quickselect(num,k);
		System.out.println(result);
	}
	public static int quickselect(int[] G, int k) {
		  return quickselect(G, 0, G.length - 1, k - 1);
	}
		 
	private static int quickselect(int[] G, int first, int last, int k) {
		if (first <= last) {
		    int pivot = partition(G, first, last);
		    if (pivot == k) {
		      return G[k];
		    }
		    if (pivot > k) {
		      return quickselect(G, first, pivot - 1, k);
		    }
		    return quickselect(G, pivot + 1, last, k);
		  }
		  return Integer.MIN_VALUE;
	}
		 
	private static int partition(int[] G, int first, int last) {
		int pivot = first + new Random().nextInt(last - first + 1);
		swap(G, last, pivot);
		  for (int i = first; i < last; i++) {
		    if (G[i] > G[last]) {
		      swap(G, i, first);
		      first++;
		    }
		  }
		  swap(G, first, last);
		  return first;
		}
		 
		private static void swap(int[] G, int x, int y) {
		  int tmp = G[x];
		  G[x] = G[y];
		  G[y] = tmp;
		}


}
