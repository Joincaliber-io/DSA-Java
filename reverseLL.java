//Program to reverse a linked list
public class reverseLL {

    private Node head;

    private static class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;

        }
    }

    // To insert a number
    public void insertend(Node node) {

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = node;
        }
    }

    // To display the list
    public void displaylist(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.format("%d ", temp.value);
            temp = temp.next;
        }
        System.out.println();
    }

    // Reverse linkedlist using this function
    public static Node reverseLinkedList(Node currentNode) {
        // For first node, previousNode will be null
        Node previousNode = null;
        Node nextNode;
        while (currentNode != null) {
            nextNode = currentNode.next;
            // reversing the link
            currentNode.next = previousNode;
            // moving currentNode and previousNode by 1 node
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }

    public static void main(String[] args) {
        reverseLL list = new reverseLL();
        // Creating a linked list
        Node head = new Node(9);
        list.insertend(head);
        list.insertend(new Node(8));
        list.insertend(new Node(7));
        list.insertend(new Node(6));
        list.insertend(new Node(5));

        list.displaylist(head);
        // Reversing LinkedList
        Node reverseHead = reverseLinkedList(head);
        System.out.println("After reversing");
        list.displaylist(reverseHead);

    }

}