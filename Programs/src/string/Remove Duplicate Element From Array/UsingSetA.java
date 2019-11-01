//for sorted and unsorted array 
//set doesnt allow duplicate value
import java.util.*;
public class UsingSetA {
    public static void main(String[] args) {
        int[] arr = {1,100,1,2,2,3,3,4,5,6,7,7,8,101};
        Set<Integer> s = new LinkedHashSet<>();
        for(int i=0; i<arr.length; i++) {
            s.add(arr[i]);
        }
        for(int i: s) {
            System.out.print(i + " ");
        }
    }
}