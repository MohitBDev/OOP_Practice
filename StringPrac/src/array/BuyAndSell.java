package array;

public class BuyAndSell {

	public static void main(String[] args) {
	int [] arr={110,240,340,345,230,90};
	//	int [] arr={11,42,49,20,20,18,34,53};
		
		int minprice=Integer.MAX_VALUE;
		int maxprofit=0;
		int buyday=0;
		int sellday=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<minprice) {
				minprice=arr[i];
				buyday=i+1;
				
			}
			else if(arr[i]-minprice>maxprofit){
				maxprofit=arr[i]-minprice;
				sellday=i+1;
				
			}
		}
		System.out.println("BuyDay :" +buyday +" SellDay :" +sellday);
		System.out.println("Maxprofit :" +maxprofit);
		
	}

}