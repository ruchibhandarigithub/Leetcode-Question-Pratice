
/*
 * Given two numbers n and k, you need to rotate n, k times to the right. If k is negative, rotate n, k times to the left.

Note:

Rotating right means removing rightmost digit from n and adding it to the start.

Rotating left means removing leftmost digit from n and adding it to the end.

Assume that the number of rotations will not result in leading 0's, i.e. n=1203, k =2 such that 0312 is the answer, such test cases will not be given.

k can be bigger than n.

Input Format
First line which has two integer n and k.

Output Format
Print the rotated number in a single line.

Example 1
Input

1256 1
Output

6125
Explanation

since k=1, right rotating the number one time leads to 6125.

Example 2
Input

1256 -1
Output

2561
Explanation

since k=1, left rotating the number one time leads to 2561.

Constraints
1 <= n,k <= 10^9
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        System.out.println(rotate(n, k));
        sc.close();
    }

    public static int rotate(int n, int k) {
        String num = Integer.toString(n);
        int len = num.length();
        k %= len;
        if (k < 0) {
            k = k + len;
        }
        String ans = num.substring(len - k) + num.substring(0, len - k);
        return Integer.parseInt(ans);
    }

}