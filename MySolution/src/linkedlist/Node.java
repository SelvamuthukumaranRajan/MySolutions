package linkedlist;

public class Node {
    int value;
    Node child;
    public Node(int value, Node child){
        this.value = value;
        this.child = child;
    }

    //Linked List init
    // Node head = new Node(1, null);
    // int i = 2;
    // while(i<8){
    //     head = new Node(i++, head);
    // }

    //Result LinkedList
    //7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1

}
