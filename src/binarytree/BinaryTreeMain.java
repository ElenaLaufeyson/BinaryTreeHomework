
package binarytree;

import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;

public class BinaryTreeMain {

    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        List<Integer> list = Arrays.asList(2, 4, 8, 6, 5, 7, 1, 9);
        tree.addAll(list);
        System.out.println(list);
        SortedSet set = tree.subSet(2, 8);
        System.out.println(set);
        SortedSet set2 = tree.tailSet(4);
        System.out.println(set2);
    }
    
}
