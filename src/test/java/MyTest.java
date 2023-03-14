
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyTest {
    @Test
    public void testAddAndGet() {
        MyArrayList<Integer> list = new MyArrayList<>();
        assertTrue(list.add(1));
        assertTrue(list.add(2));
        assertTrue(list.add(3));
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }

    @Test
    public void testSet() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.set(1, "orange");
        assertEquals("orange", list.get(1));
    }

    @Test
    public void testDelete() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(2,list.delete(1));
        assertEquals(1, list.get(0));
        assertEquals(3, list.get(1));
    }

    @Test
    public void testSize() {
        MyArrayList<String> list = new MyArrayList<>();
        for (int i = 0; i < 17; i++) {
            list.add("app");
        }
        assertEquals(32, list.size());
    }

    @Test
    public void testToArray() {
        Object[] arr = {1,2,3};
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Object[] newArr = list.toArray();
        for (int i = 0; i < 3; i++) {
            assertEquals(arr[i], newArr[i]);
        }
    }

}