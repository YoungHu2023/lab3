import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;


public class LinkedListTests {
    @Test
    public void testPrepend(){
        LinkedList list = new LinkedList();
        list.prepend(1);
        assertEquals(1, list.root.value);
        assertEquals(null, list.root.next);
        list.prepend(2);
        assertEquals(2, list.root.value);
        assertEquals(1, list.root.next.value);
    }

    @Test
    public void testAppend(){
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        assertEquals(2, list.root.next.value);
        assertEquals(null, list.root.next.next);
        list.append(3);
        assertEquals(3, list.root.next.next.value);
        assertEquals(null, list.root.next.next.next);
    }

    @Test
    public void testLast(){
        LinkedList list = new LinkedList();
        list.prepend(1);
        list.prepend(2);
        assertEquals(1, list.last());
    }

    @Test
    public void testToString(){
        LinkedList list = new LinkedList();
        list.prepend(1);
        list.prepend(2);
        assertEquals("2 1 ", list.toString());
    }

    @Test
    public void testLength(){
        LinkedList list = new LinkedList();
        assertEquals(0, list.length());
        list.prepend(1);
        list.prepend(2);
        assertEquals(2, list.length());
    }
}
