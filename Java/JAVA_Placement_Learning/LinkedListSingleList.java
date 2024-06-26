import javax.swing.text.html.parser.Element;

public class LinkedListSingleList {

    Node head;
    Node newHead;
    int size = 0;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;

        }
    }

    // add - First (add element to first position)
    public void addFirst(String data) {
        size++;
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    // add - Last (add element to last position)
    public void addLast(String data) {
        size++;
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    // Print Single Linked List
    public void printList() {

        if (head == null) {
            System.out.println("The List is Empty");
            return;
        }

        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");

    }

    // Search in Single Linked List ( O(n)) not good
    public void searchList(String data) {
        Node currNode = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        while (currNode != null) {
            if (currNode.data == data) {
                System.out.println("Element found at node :" + currNode.hashCode());
                return;
            }
            currNode = currNode.next;
        }
        System.out.println("Element not found");

    }

    // Delete the Fisrt element
    public void deleteFirst() {

        Node currNode = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = currNode.next;
        size--;
        printList();

    }

    // Delete the Last element
    public void deleteLast() {

        Node currNode = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node SecondLastNode = head;
        Node LastNode = head.next;

        while (LastNode.next != null) {

            LastNode = LastNode.next;
            SecondLastNode = SecondLastNode.next;

        }
        SecondLastNode.next = null;
        printList();

    }

    // Size of the List
    public void getSize() {

        System.out.println("Size of the List : " + size);

    }

    // Reverse List
    private void reverseListIteratevely() {

        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = prevNode.next;

        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;

        }
        head.next = null;
        head = prevNode;
        printList();
    }

    public void deleteElementOfNPositionFromLast(int elementNumber) {

        if (head == null || head.next == null) {
            return;
        }

        int size = 0;
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            size++;
            curr = curr.next;
        }

        int count = 0, elementPositionFromStart = 0;

        elementPositionFromStart = (size - elementNumber) + 1;

        if (elementPositionFromStart == 1) {
            head = head.next;
            printList();
        }

        curr = head; // resetting the crr poniter to head, after size finding oprxn above.

        while (curr != null) {

            count++;

            if (count == elementPositionFromStart) {

                if (prev != null){
                    prev.next = curr.next;
                    break;// since the element is deleted no further iterantion is required
                }

            }
            prev = curr;

            curr = curr.next;

        }

        printList();

    }

    public static void main(String[] args) {

        LinkedListSingleList list = new LinkedListSingleList();

        list.printList();

        System.out.println("Adding elements to the List using Ad first");

        list.addFirst("By");
        list.addFirst("Created");

        list.getSize();
        list.printList();
        System.out.println();

        System.out.println("Adding elements to the List using Add last");
        list.addLast("Kartik");
        list.getSize();
        list.printList();
        System.out.println();

        System.out.println("Searching element in the List");
        list.searchList("Sharma");
        System.out.println();

        System.out.println("Reversing the List using Iteration");
        list.reverseListIteratevely();
        System.out.println();

        System.out.println("Deleting the first element in List");
        list.deleteFirst();
        list.getSize();
        System.out.println();

        System.out.println("Deleting the Last element in List");
        list.deleteLast();
        list.getSize();
        System.out.println();

        // Delete nth element from the last of the list
        System.out.println("Delete 3rd element from the last of the list ");
        list.addFirst("B");
        list.addFirst("A");
        list.addLast("D");
        list.printList();
        list.getSize();
        list.deleteElementOfNPositionFromLast(3);

    }

}