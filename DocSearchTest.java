import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DocSearchTest {
    @Test
    public void testNoPathWorks() {
        Handler myHandler = new Handler(".\technical\biomed");
        URI myUrl = URI.create("hi");
        assertEquals("Don't know how to handle that path!", myHandler.handleRequest(myUrl));
    }
}