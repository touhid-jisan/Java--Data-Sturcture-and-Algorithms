public class QuickSort {
    static void sort(int[] arr, int start, int end) {
        if(start < end) {
            int pi = partition(arr, start, end);
            sort(arr, start, pi-1);
            sort(arr, pi+1, end);
        }
       
    }
    static int partition(int[] arr, int start, int end) {
            int pivot = arr[end];
            int partionIndex = start;
            for(int i=start; i<=end; i++) {
                if(arr[i] < pivot) {
                    int temp =arr[partionIndex];
                    arr[partionIndex] = arr[i];
                    arr[i] = temp;
                    partionIndex++;
                }
            }
            arr[end] = arr[partionIndex];
            arr[partionIndex] = pivot;
            return partionIndex;
        
    }
    public static void main(String[] args) {
        int[] arr = {11, 6,1,8,3,4,9,2,10};
        int start =0;
        int end = arr.length-1;
        System.out.println("before sorting");
        for(int i: arr) {
            System.out.printf(i + " ");
        }
        sort(arr ,start, end);
        System.out.println("\nafter sorting");
        for(int i: arr) {
            System.out.print(i + " ");
        }
        
    }
}