package CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class ListIteratorDemo {
    /*******************************
     * public interface ListIterator<E> extends Iterator<E> {
     *      void add(E e);
     *      void set(E e);
     *      void remove(E e);
     *    ***************************************************************
     *    * boolean hasNext();                  * bidirectional access  *
     *    * E next();                           *************************
     *    * boolean hasPrevious();              *  
     *    * E previous();                       *
     *    * int nextIndex();                    *
     *    * int previousIndex()                 *
     *    ***************************************
     * }
     */
    static void listIteratorDemo() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println("Displaying Current Elements");
       
        for(ListIterator<String> iterator = list.listIterator();  iterator.hasNext(); ) {
            System.out.println("iterator.nextIndex() : " + iterator.nextIndex() + ", iterator.next() : " + iterator.next());
        }
        System.out.println("add, remove and set operation");
        for (ListIterator iterator = list.listIterator(); iterator.hasNext();) {
            System.out.println("iterator.nextIndex() : " + iterator.nextIndex() + ", iterator.next() : "  + iterator.next());
            if(iterator.nextIndex()  == 1) {
                iterator.add("text"); // it will add the element and will advance the cursor
                System.out.println("iterator.nextIndex() : " + iterator.nextIndex() + ", iterator.next() : "  + iterator.next());

                System.out.println("Removing test that was added in index 1"); 
                iterator.previous(); //b
                iterator.previous(); //test
                iterator.remove(); // remove test 

                // set should be provided by next/previous/set
                //iterator.set("text"); //will show error

                System.out.println("iterator.nextIndex() : " + iterator.nextIndex() + ", iterator.next() : " + iterator.next());
                System.out.println("Setting element at index 1 as test");
                iterator.set("test"); // will not show error, as we invoked iterator.next( ) method in prev line  

                System.out.println("Setting element at index 1 test1 to show that two set opearation can be invoked separately");
                iterator.set("test1");
            }
        }
        System.out.println("Displaying current elements");
        for(ListIterator iterator = list.listIterator(); iterator.hasNext();) {
            System.out.println("iterator.nextIndex() : " + iterator.nextIndex() + ", iterator.next() : "  + iterator.next());
        }
    }
    public static void main(String[] args) {
        listIteratorDemo();
    }
}