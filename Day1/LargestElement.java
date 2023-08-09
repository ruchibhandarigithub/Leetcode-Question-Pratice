package Day1;

import java.util.*;
import java.io.*;

public class LargestElement {

    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(arr[i], max);
        }
        return max;

    }
}
