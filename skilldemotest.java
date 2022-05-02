import static org.junit.Assert.*;
import org.junit.*;


public class skilldemotest{
    @Test
    public void testAdd(){
        assertEquals(2, skilldemo.add(1,2));
    }
}