package Day1;

public public class Solution {
    public static int[] getSecondOrderElements(int n, int[] arr) {
        // Write your code here.
        int result[] = new int[2];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(arr[i], min);
            max = Math.max(arr[i], max);
        }
        int secondLargest = Integer.MIN_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > secondLargest && arr[i] != max) {
                secondLargest = arr[i];
            }
            if (arr[i] < secondSmallest && arr[i] != min) {
                secondSmallest = arr[i];
            }
        }
        result[0] = secondLargest;
        result[1] = secondSmallest;
        return result;
    }
}
