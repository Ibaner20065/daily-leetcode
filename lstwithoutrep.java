class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n =s.length();
        int l = 0;

        for  ( int i =0;i<n;i++)
               {
                String c = ""; 
               
        for (int j =i;j<n;j++){

        
            char z = s.charAt(j);
            boolean found =false;
            for(int k =0; k<c.length();k++){
                if(c.charAt(k)==z){
                    found = true;
                    break;
                }
            }
        if(!found){
        c=c+z;
        }else{
            break;
        }
     
        }
        l= Math.max(l,c.length());
               }
    
    return l;
}
}
