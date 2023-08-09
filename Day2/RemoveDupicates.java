package Day2;

class Solution {
    public int removeDuplicates(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp++;
                arr[temp] = arr[i + 1];
            }
        }
        return temp + 1;
    }
}