class Solution {
    public int maximumWealth(int[][] accounts) {

        int sum3 = 0;   

        for (int i = 0; i < accounts.length; i++) {

            int sum2 = 0;   

            for (int j = 0; j < accounts[i].length; j++) {
                sum2 = sum2 + accounts[i][j];
            }

            if (sum2 > sum3) {
                sum3 = sum2;
            }
        }

        return sum3;
    }
}
