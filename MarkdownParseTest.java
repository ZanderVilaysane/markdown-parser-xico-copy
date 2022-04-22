import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition(){
        assertEquals(2, 1 + 1);
    }
    @Test
    public void testfile1() throws IOException{
        ArrayList<String> expected =  new ArrayList<String>();
        expected.add("https://something.com");
        expected.add("some-thing.html");
        Path fileName = Path.of(
            "/Users/xicoreyes/Documents/GitHub/markdown-parser-copy/test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);



        assertEquals(expected, links);
    }
}