public class SelectionSort  {
    public static void main(String[] args) {
        int[] arr = {11, 6,7,8,3,4,9,2,10};
        for(int lastUnsortedIndex = arr.length-1; lastUnsortedIndex >0; lastUnsortedIndex--) {
            int largestIndex =0; 
            for(int i=1; i <= lastUnsortedIndex; i++) {
                if(arr[i] > arr[largestIndex]) {
                    largestIndex = i;
                }
            }
            int temp = arr[largestIndex];
            arr[largestIndex] = arr[lastUnsortedIndex];
            arr[lastUnsortedIndex] = temp;
        }
        for(int i: arr) {
            System.out.printf("%d ", i);
        }
    }
}