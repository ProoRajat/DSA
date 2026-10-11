package Linked_List.Singly_Linked_List;

public class ListMethods {
    // method to traverse and print the singly linked list recursively
    public static void traverseList_Recursively(Node head) {
        // base condition
        if (head == null) {
            System.out.println();
            return;
        }

        System.out.print(head.data);
        // print arrow if not last node
        if (head.next != null) {
            System.out.print(" -> ");
        }

        // moving to next node
        traverseList_Recursively(head.next);
    }

    // method to traverse and print the singly linked list iteratively
    public static void traverseList_Iteratively(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }

    // insert node at the beginning
    public static Node insertAtFront(Node head, int x) {
        Node newNode = new Node(x);
        newNode.next = head;
        return newNode;
    }

    // insert node at the end
    public static Node insertAtEnd(Node head, int x) {
        Node newNode = new Node(x);

        if (head == null) {
            return newNode;
        }

        Node last = head;

        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;

        return head;
    }

    // insert node at position
    public static Node insertAtPos(Node head, int pos, int val) {
        if (pos < 1) {
            return head;
        }

        if (pos == 1) {
            Node newNode = new Node(val);
            newNode.next = head;
            return newNode;
        }

        Node curr = head;

        for (int i = 1; i < pos - 1; i++) {
            curr = curr.next;
        }

        if (curr == null) {
            return head;
        }

        Node newNode = new Node(val);
        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }

    // Delete the beginning node
    public static Node deleteHead(Node head) {
        if (head == null) {
            return null;
        }

        Node temp = head;
        head = head.next;
        temp = null;
        // here temp is not necessary in java but in C/C++ if we just set head to head.next we can not free the memory space from head
        // This behavior is due to the garbage collector.

        return head;
    }

    // remove the last node
    public static Node removeLastNode(Node head) {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return null;
        }

        Node secondLast = head;
        while(secondLast.next.next != null) {
            secondLast = secondLast.next;
        }

        secondLast.next = null;

        return head;
    }

    public static Node deleteNode(Node head, int x) {
        Node temp = head;

        // Case 1: Head is to be deleted
        if (x == 1) {
            head = temp.next;
            temp = null;
            return head;
        }

        // Case 2: Traverse to the node before the one to be deleted
        Node prev = null;
        for (int i = 1; i < x; i++) {
            prev = temp;
            temp = temp.next;
        }

        // Delete the node at position x
        prev.next = temp.next;
        temp = null;

        return head;
    }

    public static boolean searchKey_Iterative(Node head, int key) {
        Node curr = head;

        while (curr != null) {
            if (curr.data == key) {
                return true;
            }
            curr = curr.next;
        }

        return false;
    }

    public static boolean searchKey_Recursive(Node head, int key) {
        if (head == null) {
            return false;
        }

        if (head.data == key) {
            return true;
        }

        return searchKey_Recursive(head.next, key);
    }

    public static Node reverseList_Iterative(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static Node reverseList_Recursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node rest = reverseList_Recursive(head.next);
        head.next.next = head;
        head.next = null;

        return rest;
    }
}
