class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        for(int i=0;i<prices.length-1;i++){
                            
                  int profit=0;

            for(int j=i+1;j<prices.length;j++){
                  if(prices[j]>prices[i]){
                   profit=prices[j]-prices[i];
                   
                   if(profit>max){
                  max=profit;
                 }
                
              }
              else{
                  break;
              }
            }
        }
            if(max>0){
                return max;
            }
            else{
                return 0;
            }
        
    }
}
//Runtime: 16 ms
//Memory Usage: 61.6 MB
