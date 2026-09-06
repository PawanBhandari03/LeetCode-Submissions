class Solution {
    public int reverse(int x) {
        int lastdigit = 0;
        int revno = 0;
        int sign = x < 0 ? -1 : 1;
        x = Math.abs(x);

        while(x>0){
            lastdigit = x % 10;

            if (revno > (Integer.MAX_VALUE - lastdigit) / 10) {
                return 0;
            }

            revno = revno * 10 + lastdigit;
            x = x / 10;
        }
        return revno * sign;
    }
}