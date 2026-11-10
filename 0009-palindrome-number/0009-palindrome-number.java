class Solution {
    public boolean isPalindrome(int x) {
        int originalNumber = x;
        int reverseNumber = 0;

        while(x > 0) {
            int digit = x % 10;
            reverseNumber = reverseNumber * 10 + digit;
            x = x/10;
        }

        return (originalNumber == reverseNumber);
    }
    
}