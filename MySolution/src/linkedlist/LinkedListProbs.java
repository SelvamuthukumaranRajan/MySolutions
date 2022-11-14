package linkedlist;

public class LinkedListProbs {
   
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

    public Node reverseLinkedList(Node head){
        Node current = head;
        Node result = null;

        while(current!=null){
            Node nextChild = current.child;
            current.child = result;
            result = current;
            current = nextChild;
        }

        return result;
    }

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

    public String linkedListToString(Node head){
        StringBuilder result = new StringBuilder();

        while(head!=null){
            result.append(head.value);
            head = head.child;
        }
        
        return result.toString();
    }
}
