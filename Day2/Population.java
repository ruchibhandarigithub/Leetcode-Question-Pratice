/*
You are given with the population of a school which is a large integer represented as an integer array where each element at ith position denotes the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0''''s. If one student is added to school find the new population formed in the form of an array of digits.

Input Format
The First line of input contains an array .

Output Format
Print an array which is the incremented population.

Example 1
Input

3
1 2 3

Output

1 2 4

Explanation

The array represents the integer 123. Incrementing by one gives 123 + 1 = 124. Thus, the result should be 1 2 4.

Example 2
Input

4
4 3 2 1

Output

4 3 2 2

Explanation

The array represents the integer 4321. Incrementing by one gives 4321 + 1 = 4322. Thus, the result should be 4 3 2 2

Constraints
1 <= digits.length <= 100

0 <= digits[i] <= 9

digits does not contain any leading 0''''s.
 */
import java.util.*;
 
class Solution {
    public int[] population(int[] nums) {
        // Write your code here
         int n = nums.length;
		int carry =1;
		for(int i=n-1;i>=0;i--){
			int rem =(nums[i]+carry)%10;
			carry=(nums[i]+carry)/10;
				nums[i] =rem;
		}
		if(carry==1){
			int result[]=new int[n+1];
			result[0]=carry;
			int j=0;
			for(int i=1;i<n+1;i++){
				result[i]=nums[j];
				j++;
			}
			return result;
		}
		return nums;
		
      }
}
 
public class Main{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
       }
        sc.close();
        Solution Obj = new Solution();
        int[] a=Obj.population(arr);
       for(int i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
    }
}