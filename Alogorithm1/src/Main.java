import java.util.Random;

public class Main {
     static class Node {
        int val;
        Node next;

        Node(int x){
            val = x;
            next = null;
        }
    }


    static class Algorithm {

        public Node insertionSortList(Node head) {
            if (head == null || head.next == null) {
                return head;
            }

            Node n = new Node(0);  // Dummy node to simplify insertion
            Node current = head;  // Pointer to iterate through the original list

            while (current != null) {
                Node prev = n;
                Node next = current.next;

                // Find the correct position to insert the current node
                while (prev.next != null && prev.next.val < current.val) {
                    prev = prev.next;
                }

                // Insert current between prev and prev.next
                current.next = prev.next;
                prev.next = current;

                // Move to the next element in the input list
                current = next;
            }

            return n.next;
        }

        // Helper function to print the linked list
        public static void printList(Node head) {
            while (head != null) {
                System.out.print(head.val + " ");
                head = head.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Algorithm solution = new Algorithm();

            Node head = new Node(4);
            head.next = new Node(-2);
            head.next.next = new Node(1);
            head.next.next.next = new Node(3);
            head.next.next.next.next = new Node(-6);

            System.out.println("Unsorted list:");
            solution.printList(head);

            Node sortedHead = solution.insertionSortList(head);
            solution.printList(sortedHead);
        }
     }
}
