import javax.swing.text.html.parser.Element;

public class LinkedListSingleList {

    static Node head;
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

        // int size = 0;
        Node prev = null;
        Node curr = head;
        /*
         * while (curr != null) {
         * size++;
         * curr = curr.next;
         * }
         */
        int count = 0, elementPositionFromStart = 0;

        elementPositionFromStart = (size - elementNumber) + 1;

        if (elementPositionFromStart == 1) {
            size--;
            head = head.next;
            printList();
        }

        curr = head; // resetting the crr poniter to head, after size finding oprxn above.

        while (curr != null) {

            count++;

            if (count == elementPositionFromStart) {

                if (prev != null) {
                    size--;
                    prev.next = curr.next;
                    break;// since the element is deleted no further iterantion is required
                }

            }
            prev = curr;

            curr = curr.next;

        }

        printList();

    }

    private void palindromeChecker() {

        StringBuffer testA = new StringBuffer();
        StringBuffer testB = new StringBuffer();

        Node curr = head;

        while (curr != null) {

            testA.append(curr.data);

            curr = curr.next;
        }
        System.out.println("Test A String (original list) : " + testA);

        Node prev = head;
        curr = head.next;

        while (curr != null) {
            Node NEXT = curr.next;
            curr.next = prev;

            prev = curr;
            curr = NEXT;

        }

        head.next = null;
        head = prev;
        curr = head;
        while (curr != null) {

            testB.append(curr.data);

            curr = curr.next;
        }
        System.out.println("Test B String (Reversed list) : " + testB);

        if (testA.toString().equals(testB.toString())) {
            System.out.println(">>>The list is a Palindrome<<<");
        } else
            System.out.println(">>>List is not a Palindrome<<<");

    }

    public Node middleFinder(Node head) {
        // Finding middel usinh Hare Turtle Approach
        Node midHead = null;
        Node Turtle = head, Hare = head;
        while (Hare.next.next != null) {
            Turtle = Turtle.next;
            Hare = Hare.next.next;

            if (Hare.next == null)
                break;

        }

        midHead = Turtle;

        return midHead;

    }

    public void palindromeCheckerSpaceSaver() {

        // Solution - Reverse half of the list : A -> B -> B <- A
        //                                                  |
        //                                                  nULL

        // REVERSING THE Half List
        // find the mid of the LinkedList and set it as head.

        Node midHead = middleFinder(head);

        Node prev = midHead;
        Node curr = midHead.next;
        int midCount = 0;

        while (curr != null) {

            midCount++;
            Node NEXT = curr.next;
            curr.next = prev;

            prev = curr;
            curr = NEXT;
        }
        midHead.next = null;
        midHead = prev;

        curr = head;
        Node BackCurr = midHead;

        while (curr != null && BackCurr != null) {

            if (curr.data != BackCurr.data) {
                System.out.println(" in the IF - Curr Value : " + curr.data);
                System.out.println(" in the IF - BackCurr Value : " + BackCurr.data);
                System.out.println(">>>Not a Palindrome<<<");
                return;
            }
            curr = curr.next;
            BackCurr = BackCurr.next;

        }
        System.out.println(">>>Is a Palindrome<<<");

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
        list.getSize();
        System.out.println();

        // Emptying the whole List
        head = null;
        list.printList();
        System.out.println();

        // Checking if the List is palindrome
        System.out.println("Checking if the List is palindrome");
        list.addLast("A");
        list.addLast("B");
        list.addLast("C");
        list.addLast("D");
        list.printList();
        list.palindromeChecker();
        System.out.println();

        //// Checking if the List is palindrome with O(1) space complexity
        // Emptying the whole List
        head = null;
        list.printList();
        System.out.println();
        System.out.println("Checking if the List is palindrome - the Space complextity on O(1)");
        list.addLast("1");
        list.addLast("2");
        list.addLast("2");
        list.addLast("1");
        list.addLast("5");
        list.addLast("6");
        list.addLast("1");
        list.addLast("2");
        list.addLast("2");
        list.addLast("1");
        list.printList();
        list.palindromeCheckerSpaceSaver();
        System.out.println();

    }

}