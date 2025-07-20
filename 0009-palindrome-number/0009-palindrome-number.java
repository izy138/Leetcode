class Solution {
    public boolean isPalindrome(int x) {

        //44 44
        //114 411
        //121

        //checks if its negative or 0, or a multiple of 10
        if (x < 0 || x % 10 == 0 && x!=0) {
            return false;
        }

        int reversed = 0; // x = 12321
        //rebuild the int in reverse by taking the modulus, setting it to reversed
        while (x > reversed){
            // x % 10  -  12321 % 10 = 1
            // reversed * 10 allows for tens etc
            reversed = reversed * 10 + x % 10;
            x = x / 10; // 12321 / 10 = 1232
            //first past is x = 1232 rev = 1;
            //second pass is x = 123 rev = 12; ( 1*10 + 2 (1232 % 10))
            //third pass is x = 12 rev = 123; // x is now smaller than reversed.
        }
        return x == reversed || x == reversed/10; // x = 12 rev % 10 + 123%10 = 12
    }
}
// x = 121
// rev = 0*10 + 1 <- (121%10)   rev = 1 x = 12;
// rev = 1*10 + 2 <- (12%10)    rev = 12 x =1;
// x = 1 rev = 12