public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {11, 6,1,8,3,4,9,2,10};

        for(int unsortedIndex = 1; unsortedIndex < arr.length; unsortedIndex++) {
            int element = arr[unsortedIndex];
            int i;
            for(i=unsortedIndex; i>0 && arr[i-1] >= element; i--) {
                arr[i] = arr[i-1];
            }
            arr[i] = element;
        }
        for(int i: arr) {
            System.out.printf("%d ",i);
        }
    }
}