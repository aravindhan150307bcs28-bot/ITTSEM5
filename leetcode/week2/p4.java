import java.util.Arrays;

class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int n = arr.length;
        if (n == 0)
            return arr;

        int[] temp = arr.clone();
        Arrays.sort(temp);

        // Remove duplicates
        int[] unique = new int[n];
        int m = 0;
        unique[m++] = temp[0];

        for (int i = 1; i < n; i++) {
            if (temp[i] != temp[i - 1]) {
                unique[m++] = temp[i];
            }
        }

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = binarySearch(unique, m, arr[i]) + 1;
        }

        return ans;
    }

    public int binarySearch(int[] a, int size, int key) {
        int low = 0;
        int high = size - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] == key)
                return mid;
            else if (a[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }
}
