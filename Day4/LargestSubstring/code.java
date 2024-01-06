class Solution {
    public int findlength(String s,int st,int t,int k){
        String str=s.substring(st+1,t);
        if(str.length()>k){
            k=str.length();
        }
        return k;
    }
    public int maxLengthBetweenEqualCharacters(String s) {
        int flag=-1,strt=0,end=0,k1=-1,l=s.length(),i=0,j=l-1;
        String str="";
            while(i<l){
                for(j=i+1;j<l;j++){
                    if(s.charAt(i)==s.charAt(j)){
                        if(i==j-1 && s.length()==2){
                            k1=0;
                            flag=0;
                            break;
                        }
                        if(j>end && end!=0){
                            strt=i;
                            end=j;
                            k1=findlength(s,strt,end,k1);
                        }   
                        if(strt==0 && end==0){
                            strt=i;
                            end=j;
                            k1=findlength(s,strt,end,k1);
                        }
                    }
                }
                if(flag==0){
                    break;
                }
                i+=1;
            }
            return k1;
    }
}
// runtime: 6ms
//Memory 41.4mB
