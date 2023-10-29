package array;

class Solution {
	
	
	
	
	
 public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
       
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
            	
                minPrice = prices[i]; // Update the minimum price if a lower price is found
            } else if (prices[i] - minPrice > maxProfit) {
            	
            	 
                maxProfit = prices[i] - minPrice; // Update the maximum profit if a higher profit is found
                System.out.println(minPrice);
           	 System.out.println(maxProfit);
           	 System.out.println("-------------");
            }
            
        }
        
        return maxProfit;
    }
    
    
 public static void main(String [] args) {
 	int [] arr={1,2,4,9,5,3,8};
 	Solution s=new Solution();
 	 int p =s.maxProfit(arr);
 	 System.out.println(p);
 }
 
}
    