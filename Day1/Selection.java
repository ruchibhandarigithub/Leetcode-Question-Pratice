package Day1;
public class Selection {
    public static void selectionSort(int[] arr) {
        //Your code goes here
        int n = arr.length;
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            swap(arr,i,min);

        }
    }
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}