class longestPalindrome1 {
    public String longestPalindrome(String s) {
        
        String longest="";
        for (int i =0;i<s.length();i++){
            for(int j =i; j<s.length();j++){
                String sub=s.substring(i,j+1);
                if(isPalindrome(sub)){
                if(sub.length() > longest.length()){
                    longest = sub;
                }
                }
            }
                }
            return longest;

            }
private boolean isPalindrome( String srr){
    int left =0;
    int right =srr.length() -1;
    while(left<right){
        if(srr.charAt(left)!= srr.charAt(right)){
            return false;
        }
        left++;
        right--;
    }
    return true;
}
}