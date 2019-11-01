public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {6,7,8,3,4,9,2};

        for(int lastUnsortedIndex = arr.length-1; lastUnsortedIndex>0; lastUnsortedIndex--) {

            for(int i=0; i<lastUnsortedIndex; i++) {
                if(arr[i] > arr[i+1] ) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        for(int i: arr) {
            System.out.printf("%d ", i);
        }
    }
}