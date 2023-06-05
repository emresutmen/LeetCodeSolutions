class Solution {
    int x = 121;
    public boolean isPalindrome(int x) {
        int originalNum = x;
        int reversedNum = 0;
     while(x > 0){
         reversedNum *= 10;
         reversedNum += (x % 10);
         x /= 10;
     }
     if(reversedNum == originalNum){
         return true;
     }else{
         return false;
     }
    }
}