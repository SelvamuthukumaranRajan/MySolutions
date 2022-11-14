package linkedlist;

public class LinkedListProbs {
   
    //To find nth element of linked list
    public int nthElementFromLast(Node head, int n){
        Node left = head;
        Node right = head;

        for(int i=0; i<n; i++){
            right = right.child;
            if(right== null){
                return -1;
            }
        }

        while(right!=null){
            left = left.child;
            right = right.child;
        }

        return left.value;
    }

    //To reverse linked list
    public Node reverseLinkedList(Node head){
        if(head == null || head.child == null){
            return head;
        }
        
        Node current = head.child;
        Node result = head;

        while(current!=null){
            Node nextChild = current.child;
            current.child = result;
            result = current;
            current = nextChild;
        }
        return result;
    }

    //To detect linked list cycle
    public boolean linkedListHasCycle(Node head){
        Node fast = head;
        Node slow = head;

        while(fast!=null && fast.child != null){
           fast = fast.child.child;
           slow = slow.child;
           if(slow.value == fast.value)
            return true;
        }

        return false;
    }

    //Middle element of the LinkedList
    //Approach 1
    public int middleElementOfLinkedList(Node head){
        Node current = head;
        int length = lengthOfLinkedList(head);
        for(int i=0; i<length/2; i++){
            current = current.child;
        }
        return current.value;
    }
    //Approach 2
    public int middleElementOfLinkedListUsingPointer(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.child != null && fast.child.child != null){
            slow = slow.child;
            fast = fast.child.child;
        }
        return slow.value;
    }

    //Lenght of linked list
    public int lengthOfLinkedList(Node head){
        Node current = head;
        int result = 1;
        while(current.child!=null){
            current = current.child;
            result++;
        }
        return result;
    }

    //To check palindrome 
    public boolean isPalindromeLikedList(Node head){
        Node original = head;
        Node reversed = reverseLinkedList(head);

        System.out.println("Original:"+linkedListToString(original));
        System.out.println("Reversed:"+linkedListToString(reversed));
        return original==reversed;
    }


    //Linked list to string
    public String linkedListToString(Node head){
        StringBuilder result = new StringBuilder();

        while(head!=null){
            result.append(head.value);
            head = head.child;
        }
        
        return result.toString();
    }
}
