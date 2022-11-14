import linkedlist.*;
import tree.*;


public class App {
    public static void main(String[] args) throws Exception {
        Node head = new Node(1, null);
        // head = new Node(2, head);
        // head = new Node(2, head);
        // head = new Node(1, head);

        int i = 2;
        while(i<8){
            head = new Node(i++, head);
        }

        System.out.println("Linked Lists");
        var linkedListObj = new LinkedListProbs();
        System.out.println("Given linked list : "+linkedListObj.linkedListToString(head));
        System.out.println("Fourth element from end of linked list : "+linkedListObj.nthElementFromLast(head, 4));
        System.out.println("Midddle element of linked list Approach1: "+linkedListObj.middleElementOfLinkedList(head));
        System.out.println("Midddle element of linked list Approach2: "+linkedListObj.middleElementOfLinkedListUsingPointer(head));
        System.out.println("Is palindrome linked list : "+linkedListObj.isPalindromeLikedList(head));
        System.out.println("Reversed linked list : "+linkedListObj.linkedListToString(linkedListObj.reverseLinkedList(head)));
        System.out.println("Given linked list : "+linkedListObj.linkedListToString(head));
        System.out.println("Is linked list have cycle : "+linkedListObj.linkedListHasCycle(head));

        Tree subtree2Left1 = new Tree(1,null,null);
        Tree subtree2Left2 = new Tree(3,null,null);
        Tree subtree2Right1 = new Tree(6,null,null);
        Tree subtree2Right2 = new Tree(8,null,null);
        Tree subtree1Left = new Tree(2,subtree2Left1,subtree2Left2);
        Tree subtree1Right = new Tree(7,subtree2Right1,subtree2Right2);
        Tree treeHead = new Tree(5,subtree1Left,subtree1Right);

        // System.out.println("Trees");
        // var treeObj = new TreeProbs();
        // System.out.println("Nth distance nodes:"+treeObj.getNthDistanceNode(treeHead, 0).toString());
        // System.out.println("Height of tree:"+treeObj.heightOfTheTree(treeHead));
        // System.out.println("Pre Order:"+treeObj.treePreOrder(treeHead).toString());
        // System.out.println("Post Order:"+treeObj.treePostOrder(treeHead).toString());
        // System.out.println("In Order:"+treeObj.treeInOrder(treeHead).toString());
        // System.out.println("Level Order:"+treeObj.treeLevelOrder(treeHead).toString());
        // System.out.println("IsBST :"+treeObj.isBST(treeHead));

    }
}
