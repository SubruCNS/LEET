class Solution {
    public boolean checkIfExist(int[] arr) {
        int f=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]*2==arr[i] || arr[j]==2*arr[i]){
                    f=1;
                    break;
                }
            }
        }
        if(f!=1){
            return false;
        }
        else{
            return true;
        }
        
    }
}
//Runtime:5ms and Memory:42.57Mb
//Total time taken:5 mins
