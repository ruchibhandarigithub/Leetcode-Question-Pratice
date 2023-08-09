public class Solution {
    public static int isSorted(int n, int[] arr) {
        // Write your code here.
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return 0;
            }
        }
        return 1;
    }
}