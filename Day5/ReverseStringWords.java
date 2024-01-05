class Solution {
    public String reverseWords(String s) {
       	s.trim();
        String str="",cpy="";
        String fwrd="";
        int fp=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                fwrd+=s.charAt(i);
            }
            else{
                break;
            }
        }
        if(fwrd.length()!=0){
         fp=s.indexOf(fwrd.charAt(0));
        }
        else{
            for(int i=0;i<s.length();i++){
             if(s.charAt(i)!=' '){
                fwrd+=s.charAt(i);
                break;
             }
            }
         fp=s.indexOf(fwrd.charAt(0));
        }
        int p=0;
        for(int i=s.length()-1;i>-1;i--){
            if(s.charAt(i)!=' '){
              cpy+=s.charAt(i);
            }
            if(i==s.length()-1){
              p=s.length()-1;
            }
            else{
                p=i+1;
            }
            if(s.charAt(i)==' '){
                if(cpy!=""){
                    for(int j=cpy.length()-1;j>=0;j--){
                        str+=cpy.charAt(j);
                    }
                    cpy="";
                }
                if(i>=fp && s.charAt(p)!=' '){
                str+=' ';
                }
            }
        }
        if(s.charAt(0)!=' '){
            str+=fwrd;
        }
        return str;
    }
}
// Runtime 25ms memory:46.4mB
