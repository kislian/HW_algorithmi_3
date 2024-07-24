import org.example.IntegerList;
import org.example.IntegerListImpl;
import org.example.SortIntegerMassiv;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class IntegerListImplTest {
    private IntegerListImpl integerList;
    private SortIntegerMassiv sortIntegerMassiv;
    public int[] actualMasssivBeforeSort;
    public Integer[] actualMasssivSort;
    public Integer[] extentedMasssivSort=new Integer[]{
            1, 2, 3, 4, 5,
    };

    public int[] expectedMasssivAfterSort = new int[]{
            1, 2, 3, 4, 5,
    };
    @BeforeEach
    public void setUp() {
        integerList = new IntegerListImpl();
        sortIntegerMassiv = new SortIntegerMassiv();
        actualMasssivBeforeSort = new int[]{
                2, 4, 1, 5, 3,
        };
        actualMasssivSort= new Integer[]{
         4,2,1,3,5
        };
        }
    @Test
    public void testAdd() {
        integerList.add(1);
        integerList.add(2);
        assertEquals(2, integerList.size());
        assertTrue(integerList.contains(1));
        assertTrue(integerList.contains(2));
    }
    @Test
    void testAddAtIndex() {
        integerList.add(0, 1);
        integerList.add(1, 2);
        integerList.add(2, 3);
        assertEquals(3, integerList.size());
        assertEquals(1, integerList.get(0));
        assertEquals(2, integerList.get(1));
        assertEquals(3, integerList.get(2));
    }
    @Test
    void testSet() {
        integerList.add(1);
        integerList.add(2);
        integerList.set(1, 3);
        assertEquals(2, integerList.size());
        assertEquals(1, integerList.get(0));
        assertEquals(3, integerList.get(1));
    }
    @Test
    void testRemoveByItem() {
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.remove(2);
        assertEquals(2, integerList.size());
        assertFalse(integerList.contains(3));
        assertEquals(1, integerList.get(0));
        assertEquals(2, integerList.get(1));
    }
    @Test
    void testRemoveByIndex() {
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.remove(1);
        assertEquals(2, integerList.size());
        assertFalse(integerList.contains(2));
        assertEquals(1, integerList.get(0));
        assertEquals(3, integerList.get(1));
    }
    @Test
    void testContains() {
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        assertTrue(integerList.contains(1));
        assertTrue(integerList.contains(2));
        assertTrue(integerList.contains(3));
        assertFalse(integerList.contains(4));
    }
    @Test
    void testIndexOf() {
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        assertEquals(0, integerList.indexOf(1));
        assertEquals(1, integerList.indexOf(2));
        assertEquals(2, integerList.indexOf(3));
        assertEquals(-1, integerList.indexOf(4));
    }
    @Test
    void testLastIndexOf() {
        integerList.add(1);
        integerList.add(2);
        integerList.add(2);
        integerList.add(3);
        assertEquals(0, integerList.lastIndexOf(1));
        assertEquals(2, integerList.lastIndexOf(2));
        assertEquals(3, integerList.lastIndexOf(3));
        assertEquals(-1, integerList.lastIndexOf(4));
    }
    @Test
    void testGet() {
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        assertEquals(1, integerList.get(0));
        assertEquals(2, integerList.get(1));
        assertEquals(3, integerList.get(2));
    }
    @Test
    void testEquals() {
        IntegerList otherList = new IntegerListImpl();
        otherList.add(1);
        otherList.add(2);
        otherList.add(3);
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        assertTrue(integerList.equals(otherList));
    }
    @Test
    void testSize() {
        assertEquals(0, integerList.size());
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        assertEquals(3, integerList.size());
    }

    @Test
    void testIsEmpty() {
        assertTrue(integerList.isEmpty());
        integerList.add(1);
        assertFalse(integerList.isEmpty());
    }

    @Test
    void testClear() {
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.clear();
        assertEquals(0, integerList.size());
        assertTrue(integerList.isEmpty());
    }
    @Test
    void testToArray() {
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        Integer[] array = integerList.toArray();
        assertEquals(3, array.length);
        assertEquals(1, array[0]);
        assertEquals(2, array[1]);
        assertEquals(3, array[2]);
    }
    @Test
    void testSortBubble(){
        SortIntegerMassiv.sortBubble(actualMasssivBeforeSort);
       assertArrayEquals(expectedMasssivAfterSort,actualMasssivBeforeSort);
    }
    @Test
    void testSortSelection(){
        SortIntegerMassiv.sortSelection(actualMasssivBeforeSort);
        assertArrayEquals(expectedMasssivAfterSort,actualMasssivBeforeSort);
    }
   @Test
    void testSortInsertion(){
        SortIntegerMassiv.sortInsertion(actualMasssivBeforeSort);
        assertArrayEquals(expectedMasssivAfterSort,actualMasssivBeforeSort);
    }
    @Test
    void testGrow(){
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        integerList.add(9);
        integerList.add(10);
        integerList.add(11);
       assertEquals(15, integerList.getStorageSize());
    }
    @Test
    void testSort(){
    integerList.sort(actualMasssivSort);
        assertArrayEquals( extentedMasssivSort,actualMasssivSort);
    }
}
