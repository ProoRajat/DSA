package Linked_List.Singly_Linked_List;

public class Main {
    public static void main(String[] args) {
        Node head = new Node(10);   // first node
        head.next = new Node(20);   // second node
        head.next.next = new Node(30);  // third node
        head.next.next.next = new Node(40); // forth node

        // printing the linked list
        // Iterative Approach
        ListMethods.traverseList_Iteratively(head);

        // Recursive Approach
        ListMethods.traverseList_Recursively(head);

        // Insertion in the linked list
        // At the beginning
        head = ListMethods.insertAtFront(head, 1);

        // At the end
        head = ListMethods.insertAtEnd(head, 50);

        // At a specific position
        head = ListMethods.insertAtPos(head, 3, 3);

        ListMethods.traverseList_Iteratively(head);

        // Deletion from the linked list
        // Deletion at beginning
        head = ListMethods.deleteHead(head);

        // Deletion at the end
        head = ListMethods.removeLastNode(head);

        // Deletion node bt position
        head = ListMethods.deleteNode(head, 2);

        ListMethods.traverseList_Iteratively(head);

        // Searching
        System.out.println(ListMethods.searchKey_Recursive(head, 40));

        // Reversal
        head = ListMethods.reverseList_Iterative(head);

        ListMethods.traverseList_Iteratively(head);
    }
}