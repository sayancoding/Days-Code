class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}

class LinkedList {
    Node root;

    static LinkedList create(int data, LinkedList list) {
        Node new_node = new Node(data);
        if (list.root == null) {
            list.root = new_node;
        } else {
            Node temp = list.root;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
        }
        return list;
    }
    // static LinkedList delete(int value,LinkedList)

    static void show(LinkedList list) {

        Node temp = list.root;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("Null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list = list.create(12, list);
        list = list.create(10, list);
        list = list.create(22, list);
        show(list);
    }
}