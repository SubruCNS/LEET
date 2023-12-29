class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        
        int freq[]=new int[n];
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=i+1;j<n;j++){
                if(nums[j]==nums[i]){
                    c=c+1;
                }
            }
            freq[i]=c;
        }
        int max=freq[0],p=0;
        for(int i=1;i<n;i++){
           if(freq[i]>max){
               max=freq[i];
               p=i;
           }
        }
        int majele=nums[p];
        return majele;
    }
}

// STATUS-ACCEPTED
// RUNTIME-1461 ms
// Memory Usage-50.4mB
// Time taken-6m 35sec
