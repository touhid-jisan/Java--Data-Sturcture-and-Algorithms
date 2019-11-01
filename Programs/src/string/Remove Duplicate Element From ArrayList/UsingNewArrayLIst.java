import java.util.*;
public class UsingNewArrayLIst{
    public static void main(String[] args) {
        int[] a = {1,2,3,4,1,2,2,3,4,100};
        List<Integer> list = new ArrayList<>(Arrays.asList(a));
        List<Integer> list2 = new ArrayList<>();
        for(int ele : list) {
            if(!list2.contains(ele)) {
                list2.add(ele);
            }
        }
        for(int ele: list2) {
            System.out.print(ele + " ");
        }
    }
}