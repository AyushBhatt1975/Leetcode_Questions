class Solution {
    static long mod =(long) 1e9+7;

    public int countGoodNumbers(long n) {
        long odd = n / 2;
        long even = (n + 1)/2;
        return (int) ((power(5, even) * power(4, odd)) % mod);
    }

    static long power(long a, long n) {
        if (n == 0) {
            return 1;
        }
        long half = power(a, n / 2);
        if (n % 2 == 0) {
            return (half * half) % mod;
        } else {
            return ( half * half*a) % mod;
        }
    }

}