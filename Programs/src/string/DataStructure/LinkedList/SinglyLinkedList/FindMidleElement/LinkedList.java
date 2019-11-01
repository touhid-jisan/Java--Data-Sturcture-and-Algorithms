public class LinkedList {
    Node head;

    public void append(int data) {
        Node new_node = new Node(data);
        new_node.next = null;
        if(head == null) {
            head = new_node;
        } else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
        }
    }
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp + "->");
            temp = temp.next;
        }
    }
    public void push(int data) {
        Node new_node = new Node(data);
        
        if(head == null) {
            head = new_node;
            new_node.next = null;
        } else {
            new_node.next = head;
            head = new_node;
        }
    }
    public void findMiddle() {
        Node temp = head;
        Node middle = head;
        int length =0;
        while(temp != null) {
            length++;
            if(length %2 == 0) {
                middle = middle.next;
            }
            temp = temp.next;
        }
        System.out.println(middle);
    }
}