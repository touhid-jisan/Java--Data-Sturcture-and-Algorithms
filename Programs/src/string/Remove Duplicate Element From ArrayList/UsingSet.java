import java.util.*;
public class UsingSet {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2 , 3, 1, 2, 3));
        for(int i: list) {
            System.out.print(i + " ");
        }
        System.out.println();
        Set<Integer> set = new LinkedHashSet<Integer>(list);
        for(int i: set) {
            System.out.print(i + " ");
        }
    }
}