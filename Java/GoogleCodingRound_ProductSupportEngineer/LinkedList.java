import org.junit.After;

public class LinkedList {

    class Node {

        String val;
        Node next;

        Node(String val) {
            this.val = val;

        }
    }

    Node head;

    public void addFirst(String i) {
        Node newNode = new Node(i);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String j) {
        Node newNode = new Node(j);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode.next = null;

    }

    public void addAfter(String add, String after) {
        if (head == null) {
            addFirst(add);
            return;
        }
        boolean found = false;
        Node newNode = new Node(add);
        Node currNode = head;
        while (currNode != null) {
            if (currNode.val == after) {
                found = true;
                break;
            }
            currNode = currNode.next;
        }
        if (found) {
            Node temp = currNode.next;
            currNode.next = newNode;
            newNode.next = temp;
        } else {
            System.out.println("No node with value " + after);
        }

    }

    public void printList() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node currNode = head;

        while (currNode != null) {

            System.out.print(currNode.val + " -> ");
            currNode = currNode.next;

        }

    }

    public void reverse() {
        if (head == null|| head.next==null) {

            System.out.println("List cannot be reversed");
            return;

        }

        Node prevNode = head;
        Node currNode = head.next;

        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;

        }
        head.next = null;
        head = prevNode;

    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.addFirst("Am");
        list.addLast("Sharma");
        list.addAfter("Kartik", "Am");

        list.printList();

        System.out.print("\nReversed List : ");
        list.reverse();

        list.printList();

    }

}
