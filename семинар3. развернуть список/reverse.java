

public class reverse {
    public static void main(String[] args) {
        linkedList myList = new linkedList();
        myList.print();
        myList.reverse();
        myList.printRev();
    }
}

class Node {
    Node next;
    Integer load;

    public Node(Integer value) {
        load = value;
    }
}

class linkedList {
    private Node n1 = new Node(2);
    private Node n2 = new Node(6);
    private Node n3 = new Node(5);
    private Node n4 = new Node(1);
    private Node n5 = new Node(8);
    private Node n6 = new Node(10);

    public linkedList() {
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
    }

    public void print() {
        Node node = this.n1;
        System.out.print(node.load + " ");
        do {
            node = node.next;
            System.out.print(node.load + " ");
        } while (node.next != null);
    }

    public void printRev() {
        Node node = this.n6;
        System.out.print(node.load + " ");
        do {
            node = node.next;
            System.out.print(node.load + " ");
        } while (node.next != null);
    }

    public void reverse() {
        Node node = n1;
        int count = 0;
        do {
            count++;
            node = node.next;
        } while (node.next != null);

        node = n1;
        Node t1 = node;
        Node t2 = node.next;
        node.next = null;
        System.out.println();
        for (int i = 0; i < count; i++) {
            {
                node = t2;
                t2 = node.next;
                node.next = t1;
                t1 = node;
            }

        }
    }
}