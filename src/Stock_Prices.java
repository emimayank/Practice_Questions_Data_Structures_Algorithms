
public class Stock_Prices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]={90,82,86,81,93,78,240,115,243,197,35,20,45,21,200};
		int minPrice=0,maxPrice=0,diff=0;
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums.length;j++){
				if(nums[j]-nums[i]>diff && (i<j)){
					minPrice=nums[i];
					maxPrice=nums[j];
					diff=maxPrice-minPrice;
				}
			}
		}
		System.out.println("Min Price: "+minPrice+" Max Price: "+maxPrice);
	}

}
