class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int lastDigit , rev = 0;
        while(x > 0){
            lastDigit = x % 10;
            rev = rev * 10 + lastDigit;
            x = x / 10;
        }
        return original == rev;
    }
}