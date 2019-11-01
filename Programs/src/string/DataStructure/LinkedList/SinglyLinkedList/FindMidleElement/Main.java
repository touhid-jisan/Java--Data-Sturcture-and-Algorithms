public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(2);  list.append(3); list.append(2);list.append(4); list.append(5); list.append(2);list.append(6); list.append(7); list.append(8);
        list.printList();
        System.out.println();
        System.out.println();
        list.findMiddle();
    }
}