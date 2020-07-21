package CollectionFramework;

import java.util.*;
import java.util.Iterator;

public class ArrayListDemo implements Iterable<Integer>{
    public Iterator<Integer> iterator() {
        return new ArrayList().iterator();
    }
    private static List arrayListDemo() {

        //              Collection Interface
        Collection<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(1);
        list2.add(null);
        list2.add(2);
        System.out.println("List 2 : " + list2);
        list2.remove(3);
        System.out.println("List 2 : " + list2);
        list2.remove(4);
        System.out.println("List 2 : " + list2);
        list2.remove(1);
        System.out.println("List 2 : " + list2);

        //              List Interdace
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(1);
        list1.add(null);
        list1.add(2);
        System.out.println("List 1 : " + list1);
        list1.remove(3);
        System.out.println("List 1 : " + list1);
        list1.remove(4);
        System.out.println("List 1 : " + list1);
        list1.add(0, 12);
        System.out.println("List 1 : " + list1);
        list1.set(0, 9);
        System.out.println("List 1 : " + list1);
        

        /**********************************************
         *                 Bulk Operation 
         **********************************************/ 
        System.out.println("< ============    Bulk Operation   ============= >");
        
        Collection<Integer> list3 = new ArrayList<>();
        list3.add(2);
        list3.add(4);
        list1.removeAll(list3);
        System.out.println("after remove all= " + list1);
        System.out.println("list 3= " + list3);
        list1.add(2);

        // retainAll()
        list1.retainAll(list3); // return only common element between 2 list
        System.out.println("new list 1=" + list1);

        // addAll()
        list1.addAll(list3); // adds all the elements from last index
        System.out.println(list1);

        // set(index, element)
        System.out.println("retrun value " +  list1.set(0, 0));// remember it replace the value of index and returns the previous value
        System.out.println("new value of list 1 " + list1);

        //search
        System.out.println("list1.contatins(1): " + list1.contains(1));
        System.out.println("list1.indexOf(2): " + list1.indexOf(2));
        System.out.println("list1.indexOf(2): " + list1.indexOf(2)); 
        list1.add(2);
        System.out.println("list1 : " + list1);
        System.out.println("list1.lastIndexOf(2): " + list1.lastIndexOf(2));
        System.out.println("list1 : " + list1);

        //Range view sublist (after using sublist new list is backed by orginal) 
        System.out.println("rage view");
        System.out.println(list1);
        List<Integer> list4 = list1.subList(2,3);
        System.out.println("added list4 from index 2 to 3 " + list4);
        list4.set(0, 6);
        System.out.println("replaced index0 element with 6 by set method " + list4);
        System.out.println(list1);
        list4.add(0, 3);
        System.out.println("added element to the first index by add method "+list4);

        System.out.println("<=========================>");
        System.out.println("list1 : " + list1);
        System.out.println("list4 : " + list4);
        list4.add(1,8);
        System.out.println("list1 : " + list1);
        System.out.println("list4 : " + list4);
        
        // remember if we use set() then its ok for list4
        // but if we use add() we are changing structural caanges in list 1, which will effect list4 we want to access it
        // and it is okay with lsit1 if we change something in list4
        /*
        for(int element : list1) {
            System.out.println("element : " + element);
            // Generic ConcurrentModificationException
            if(element == 2) {
                list1.remove(element);
            }
        }
        */
        System.out.println("==========");
        System.out.println("list1 = " + list1);
        System.out.println("==========");
        return list1;

    }

    private static void iteratorDemo(List<Integer> list1) {
        System.out.println("Inside Iterator Demo");
        Iterator<Integer> iterator = list1.iterator();
        while(iterator.hasNext()) {
            int element  = iterator.next();
            System.out.println(element);
            if(element == 0) {
                iterator.remove();
            }
        }
        System.out.println("==========");
        System.out.println(list1);
       
    }   


    public static void main(String[] args) {

        List<Integer> list1 = arrayListDemo();
        iteratorDemo(list1);
    }
}