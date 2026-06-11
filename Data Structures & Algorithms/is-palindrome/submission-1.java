class Solution {
    public boolean isPalindrome(String s) {
    s=s.replace(" ","");
    s=s.toLowerCase();
    s = s.replace(",", "");
    s = s.replace(".", "");
    s = s.replace("!", "");
    s = s.replace(":", "");
    s = s.replace("?", "");
    s = s.replace("'", "");
    int n=s.length();
    int left=0;
    int right=n-1; 
    
    while(left<right){
        if(s.charAt(left) != s.charAt(right))
        return false;
        left++;
        right--;
    }
    return true;
    }
}
