class Solution {
    public double myPow(double x, int n) {
        
        if (n == 0) return 1;

        long power = n;     // handle large negative values
        double result = 1;

        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        while (power > 0) {

            if (power % 2 == 0) {
                x = x * x;     // square it
                power = power / 2;
            } else {
                result = result * x;  // multiply once
                power--;
            }
        }

        return result;
    }
}
