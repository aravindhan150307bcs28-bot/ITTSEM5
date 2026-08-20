class Solution {
    public int smallestEvenMultiple(int n) {
        return findGcd(n, 2) ? n : n * 2;
    }
    // User-defined helper function
    private boolean findGcd(int n, int div) {
        return n % div == 0;
    }
}
