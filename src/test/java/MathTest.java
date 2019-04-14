import org.junit.Test;

import static org.junit.Assert.*;

public class MathTest {

    private Math math = new Math();
    @Test
    public void add() {
        assertEquals(3,math.add(1,2));
    }

    @Test
    public void testAdd(){
        assertEquals(2,math.sub(8,4));
    }
}