class Solution {
    public int maxProfit(int[] prices) {
        // int i=0,p=0;
        // int minbuy=prices[0];
        // for(i=1;i<prices.length;i++){
        //     if(prices[i]<minbuy){
        //         minbuy=prices[i];
        //         p=i;
        //     } }
        // if(p==prices.length-1){
        //     minbuy=prices[0];
        //     int newi=0;
        //     for(i=0;i<p;i++){
        //       if(prices[i]<minbuy){
        //         minbuy=prices[i];
        //         newi=i;
        //     }}
        //      int k=0;
        //     int profit[]=new int[prices.length-newi];
        //     for(int j=newi+1;j<prices.length;j++){
        //         profit[k]=prices[j]-minbuy;
        //         k+=1;
        //     }
        //     int max=profit[0];
        //     for(int q=0;q<profit.length;q++){
        //         if(profit[q]>max){
        //             max=profit[q];
        //         } }
        //     if(max>0){
        //         return max;
        //     }
        //     else{
        //     return 0;
        //     } }
        // else{
        //     int k=0;
        //     int profit[]=new int[prices.length-p];
        //     for(int j=p+1;j<prices.length;j++){
        //         profit[k]=prices[j]-minbuy;
        //         k+=1; }
        //     int max=profit[0];
        //     for(int q=0;q<profit.length;q++){
        //         if(profit[q]>max){
        //             max=profit[q];
        //         } }
        //     return max;}
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
