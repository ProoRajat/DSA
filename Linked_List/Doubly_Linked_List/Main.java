package Linked_List.Doubly_Linked_List;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Node head = new Node(10);

        head.next = new Node(20);
        head.next.prev = head;

        head.next.next = new Node(30);
        head.next.next.prev = head.next;

        head.next.next.next = new Node(40);
        head.next.next.next.prev = head.next.next;

        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        // Traversal
        // ListMethods.forwardTraversal(head);
        ListMethods.forwardTraversal_Recursion(head);

        // ListMethods.backwardTraversal(tail);
        ListMethods.backwardTraversal_Recursion(tail);

        // Insertion
        // At beginning
        head = ListMethods.insertAtFront(head, 1);
        ListMethods.forwardTraversal_Recursion(head);

        // At end
        head = ListMethods.insertAtEnd(head, 50);
        ListMethods.forwardTraversal_Recursion(head);

        // At a Position
        head = ListMethods.insertAtPos(head, 2, 3);
        ListMethods.forwardTraversal_Recursion(head);

        // Deletion
        // At Front
        head = ListMethods.delHead(head);
        ListMethods.forwardTraversal_Recursion(head);

        // At end
        head = ListMethods.delLast(head);
        ListMethods.forwardTraversal_Recursion(head);

        // At a position
        head = ListMethods.delPos(head, 3);
        ListMethods.forwardTraversal_Recursion(head);
    }
}
