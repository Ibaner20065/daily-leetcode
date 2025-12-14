class Solution {
    public boolean isPalindrome(int n) {
        int m = n;
        int s=0;
        while(m>0){
            int b=m%10;
             s=s*10+b;
            m=m/10;

        }
        if(n==s){
            return true;
        }
        else{
            return false;
        }
            

        
        
        
    }
}