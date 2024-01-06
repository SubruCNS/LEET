class Solution {
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
                            str="";
                            for(int k=strt+1;k<end;k++){
                                str+=s.charAt(k);
                            }
                            if(str.length()>k1){
                                k1=str.length();
                            }
                        }   
                        if(strt==0 && end==0){
                            strt=i;
                            end=j;
                            str="";
                            for(int k=strt+1;k<end;k++){
                                str+=s.charAt(k);
                            }
                            if(str.length()>k1){
                                k1=str.length();
                            }
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
// Runtime: 16ms
//Memory: 45.76Mb
