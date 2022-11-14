package tree;

import java.util.ArrayList;
import java.util.List;

public class TreeProbs {

    //Helper functions are used to hide complexity from the user and to store the results.
    public List<Integer> treePreOrder(Tree head) {
        //To print the result

        // if (head == null)
        //     return resultList;
        // System.out.print(head.value + " ");
        // treePreOrder(head.left);
        // treePreOrder(head.right);

        //To store the result in list
        List<Integer> resulList = new ArrayList<Integer>();
        treePreOrderHelper(head,resulList);
        return resulList;
    }

    void treePreOrderHelper(Tree head, List<Integer> resulList) {
        if (head == null)
            return;
        resulList.add(head.value);
        treePreOrderHelper(head.left, resulList);
        treePreOrderHelper(head.right, resulList);
    }

    public List<Integer> treePostOrder(Tree head) {
        //To print the result

        // if (head == null)
        //     return;
        // treePostOrder(head.left);
        // treePostOrder(head.right);
        // System.out.print(head.value + " ");
        
        //To store the result in list
        List<Integer> resulList = new ArrayList<Integer>();
        treePostOrderHelper(head,resulList);
        return resulList;
    }

    void treePostOrderHelper(Tree head, List<Integer> resulList) {
        if (head == null)
            return;
        treePostOrderHelper(head.left, resulList);
        treePostOrderHelper(head.right, resulList);
        resulList.add(head.value);
    }

    public List<Integer> treeInOrder(Tree head) {
        //To print the result
        
        // if (head == null)
        //     return;
        // treeInOrder(head.left);
        // System.out.print(head.value + " ");
        // treeInOrder(head.right);

        //To store the result in list
        List<Integer> resulList = new ArrayList<Integer>();
        treeInOrderHelper(head,resulList);
        return resulList;
    }

    void treeInOrderHelper(Tree head, List<Integer> resulList) {
        if (head == null)
            return;
        treeInOrderHelper(head.left, resulList);
        resulList.add(head.value);
        treeInOrderHelper(head.right, resulList);
    }


    public List<Integer> getNthDistanceNode(Tree head, int distance){
        var list = new ArrayList<Integer>();
        getNthDistanceNodeHelper(head,distance,list);
        return list;
    }

    void getNthDistanceNodeHelper(Tree head, int distance, List<Integer> list){
        if(head == null){
            return;
        }
        if(distance == 0){
            list.add(head.value);
        }
        getNthDistanceNodeHelper(head.left, distance-1, list);
        getNthDistanceNodeHelper(head.right, distance-1, list);
    }

    public int heightOfTheTree(Tree head){
        if(head.left == null && head.right == null){
            return 0;
        }
        return 1+Math.max(heightOfTheTree(head.left), heightOfTheTree(head.right));
    }

    public List<Integer> treeLevelOrder(Tree head) {
        var list = new ArrayList<Integer>();
        var height = heightOfTheTree(head);
        int i=0;
        while(i<=height){
            var tempList = getNthDistanceNode(head, i++);
            for(int value : tempList){
                list.add(value);
            }
        }
        return list;
    }

    public Boolean isBST(Tree head) {
       return isBSTHelper(head, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    Boolean isBSTHelper(Tree head, int min, int max) {
        if(head == null)
            return true;

        if(head.value < min || head.value > max)
            return false;

        return isBSTHelper(head.left, min, head.value-1) && isBSTHelper(head.right, head.value+1, max);
    }

}
