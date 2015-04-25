package test.sort;

import static org.junit.Assert.*;

import org.junit.Test;
import main.sort.Sort;

public class SortTest {

    @Test
    public void testInsertion() {
        int[] intArray = {8, 7, 3, 2, 1};
        intArray = Sort.insertion(intArray);
        
        assertEquals("failure - unsorted should be sorted", true, Sort.isSorted(intArray));
    }
}
