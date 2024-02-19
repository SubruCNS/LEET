class Solution {
    public int ifFound(char k,String t,int j){
     int k1=-1;
     if(j!=0){
         j+=1;
     }
      for(int i=j;i<t.length();i++){
          if(k==t.charAt(i)){
              k1=i;
             break;
          }
      }
      return k1;
    }
    public boolean isSubsequence(String s, String t) {
    int f=0,p=0,prev=0;
     for(int i=0;i<s.length();i++){
        p=ifFound(s.charAt(i),t,prev);
        if(p!=-1 && prev<=p){
          System.out.println(p);
            f+=1;
            prev=p;
        }
        else{
            return false;
        }
     }
     System.out.println(f);
     if(f==s.length()){
         return true;
     }
     else{
         return true;
     }
    }
    }
//RUNTIME:2ms beats 60.67 java users
//Space:40.95MB beats 96.95 java users
//total time taken 27mins
