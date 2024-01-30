import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

class StringChecker1 implements StringChecker {

    @Override
    public boolean checkString(String s) {
        if (s.contains("a")){
            return false;
        }
        return true;
    }
    
}

public class ListTests {
    @Test
    public void testFilter(){
        ArrayList<String> list = new ArrayList<>();
        list.add("cat");
        list.add("dog");
        list.add("elephant");
        list.add("horse");
        StringChecker sc = new StringChecker1();
        List<String> actual = ListExamples.filter(list, sc);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("dog");
        expected.add("horse");
        assertEquals(expected.get(0),actual.get(0));
        assertEquals(expected.get(1),actual.get(1));
    }

    @Test
    public void testMerge(){
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("apple");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("apple");
        List<String> actual = ListExamples.merge(list, list2);
        assertEquals(expected.get(0),actual.get(0));
    }
}
