import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FlikTest {
    @Test
    public void testisSameNumber() {
        Integer A = new Integer(128);
        assertTrue(Flik.isSameNumber(1, 1));
        assertTrue(Flik.isSameNumber(127, 127));
        assertTrue(Flik.isSameNumber(128, 128));
    }
}
