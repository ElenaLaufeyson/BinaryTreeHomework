package binarytree;

import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class BinaryTreeTest {
        
    @Test
    public void testSubSet() {
        System.out.println("subSet");
        BinaryTree tree = new BinaryTree();
        List<Integer> list = Arrays.asList(2, 4, 8, 6, 5, 7, 1, 9);
        tree.addAll(list);
        SortedSet<Integer> result = tree.subSet(3, 8);
        Set<Integer> expResult = new TreeSet<>(Arrays.asList(4, 5, 6, 7, 8));
        assertEquals(expResult, result);
        
        SortedSet<Integer> result2 = tree.subSet(9, 7);
        Set<Integer> expResult2 = new TreeSet<>(Arrays.asList(7, 8, 9));
        assertEquals(expResult2, result2);
        
        SortedSet<Integer> result3 = tree.subSet(-5, 3);
        Set<Integer> expResult3 = new TreeSet<>(Arrays.asList(1, 2));
        assertEquals(expResult3, result3);
    }

    @Test
    public void testTailSet() {
        System.out.println("tailSet");
        BinaryTree tree = new BinaryTree();
        List<Integer> list = Arrays.asList(2, 4, 8, 6, 5, 7, 1, 9);
        tree.addAll(list);
        
        SortedSet<Integer> result = tree.tailSet(7);
        Set<Integer> expResult = new TreeSet<>(Arrays.asList(7, 8, 9));
        assertEquals(expResult, result);
        
        SortedSet<Integer> result2 = tree.tailSet(1);
        Set<Integer> expResult2 = new TreeSet<>(Arrays.asList(1, 2, 4, 5,6, 7, 8, 9));
        assertEquals(expResult2, result2);
        
        SortedSet<Integer> result3 = tree.tailSet(9);
        Set<Integer> expResult3 = new TreeSet<>(Arrays.asList(9));
        assertEquals(expResult3, result3);
    }

}
