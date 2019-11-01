public class BinarySearch {
    static int binarySearch(int[] arr, int left ,int right, int x) {
        if(left<= right) {
            int mid = (left+right) / 2;
            if(arr[mid] == x) {
                return mid;
            }
            if(x > mid) {
                return binarySearch(arr, mid+1, right, x);
            } else {
                return binarySearch(arr, left, mid-1, x);
            }
        }
        

        return -1 ;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10} ;
        int x = 10;
        int index = binarySearch(arr, 0 , arr.length-1, x);
        if(index != -1) {
            System.out.println(index);
        } else {
            System.out.println("Not Present");
        }

    }
}