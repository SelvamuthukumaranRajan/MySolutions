package tree;

public class Tree {
    int value;
    Tree left;
    Tree right;

    public Tree(int value, Tree left, Tree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    // Sample tree init
    // Tree subtree2Left1 = new Tree(1, null, null);
    // Tree subtree2Left2 = new Tree(3, null, null);
    // Tree subtree2Right1 = new Tree(6, null, null);
    // Tree subtree2Right2 = new Tree(8, null, null);
    // Tree subtree1Left = new Tree(2, subtree2Left1, subtree2Left2);
    // Tree subtree1Right = new Tree(7, subtree2Right1, subtree2Right2);
    // Tree treeHead = new Tree(5, subtree1Left, subtree1Right);

    // Result tree
    //         5
    //     2       7
    //   1   3   6   8
}
