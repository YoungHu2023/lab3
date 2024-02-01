import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.util.List;
import java.io.File;

public class FileTests {
    @Test
    public void testGetFiles(){
        File file = new File("some-files/");
        try{
            List<File> list = FileExample.getFiles(file);
            assertEquals("[some-files\\a.txt, some-files\\more-files\\b.txt, some-files\\more-files\\c.java, some-files\\even-more-files\\d.java, some-files\\even-more-files\\a.txt]",
                list.toString());

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    @Test
    public void testGetFiles2(){
        File file = new File("some-files/more-files");
        try{
            List<File> list = FileExample.getFiles(file);
            assertEquals("[some-files\\more-files\\b.txt, some-files\\more-files\\c.java]",
                list.toString());

        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
}
