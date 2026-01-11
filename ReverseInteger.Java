class Solution {
    public int reverse(int x) {
        int rev = 0, Original;
        Original = x;
        while(x!= 0){
            int ld = x % 10;
            if(rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10){
                return 0;
            }
            rev *= 10;
            rev += ld;
            x /= 10;
        }
        return rev;
    }
}
