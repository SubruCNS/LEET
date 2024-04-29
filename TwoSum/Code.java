class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int result[]=new int [2],i=0;
        while(i<numbers.length){
            
            int j=i+1;
            while(j<numbers.length){
                if(numbers[i]+numbers[j]==target){
                    result[0]=i+1;
                    result[1]=j+1;
                    return result;
                }
                j+=1;
            }
        
        i+=1;
        }
    return result;
    }
}
//Runtime:410ms
//Memory Used:46.94MB
