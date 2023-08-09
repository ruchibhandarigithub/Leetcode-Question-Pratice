package Day1;

public class CheckArrayIsSortedAndRotated {

    public boolean check(int[] arr) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n]) {
                count++;
            }
        }
        return (count <= 1);
    }

}
