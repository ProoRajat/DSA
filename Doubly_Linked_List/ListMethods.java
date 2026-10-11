package Linked_List.Doubly_Linked_List;

public class ListMethods {
    public static void forwardTraversal(Node head) {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }

        System.out.println();
    }

    public static void forwardTraversal_Recursion(Node head) {
        if (head == null) {
            System.out.println();
            return;
        }

        System.out.print(head.data + " ");

        forwardTraversal_Recursion(head.next);
    }

    public static void backwardTraversal(Node tail) {
        Node curr = tail;

        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.prev;
        }

        System.out.println();
    }

    public static void backwardTraversal_Recursion(Node node) {
        if (node == null) {
            System.out.println();
            return;
        }

        System.out.print(node.data + " ");

        backwardTraversal_Recursion(node.prev);
    }

    public static Node insertAtFront(Node head, int val) {
        Node node = new Node(val);
        node.next = head;

        if (head != null) {
            head.prev = node;
        }

        return node;
    }

    public static Node insertAtEnd(Node head, int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }

            curr.next = newNode;
            newNode.prev = curr;
        }

        return head;
    }

    public static Node insertAtPos(Node head, int p, int x) {
        Node newNode = new Node(x);
        Node curr = head;

        for (int i = 0; i < p; i++) {
            curr = curr.next;
        }

        if (curr.next == null) {
            curr.next = newNode;
            newNode.prev = curr;
        } else {
            newNode.next = curr.next;
            curr.next = newNode;
            newNode.next.prev = newNode;
            newNode.prev = curr;
        }

        return head;
    }

    public static Node delHead(Node head) {
        if (head == null) {
            return null;
        }

        Node temp = head;
        head = head.next;

        if (head != null) {
            head.prev = null;
        }

        return head;
    }

    public static Node delLast(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.prev.next = null;

        return head;
    }

    public static Node delPos(Node head, int x) {
        if (head == null) {
            return head;
        }

        Node curr = head;
        for (int i = 1; curr != null && i < x; i++) {
            curr = curr.next;
        }

        if (curr == null) {
            return head;
        }

        if (curr.prev != null) {
            curr.prev.next = curr.next;
        }

        if (curr.next != null) {
            curr.next.prev = curr.prev;
        }

        if (head == curr) {
            head = curr.next;
        }

        curr = null;
        return head;
    }
}
