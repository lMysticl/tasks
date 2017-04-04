import btn.Btn;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author putrenkov pavlo
 */
public class BTNTest {

    @Test
    public void testCompareToNull() throws Exception {
        Btn node = new Btn(1);
        assertEquals(-1, node.compareTo(null));
    }

    @Test
    public void testCompareToSimple() throws Exception {
        Btn node = new Btn(1);
        Btn node2 = new Btn(1);
        assertEquals(0, node.compareTo(node2));
    }

    @Test
    public void testCompareTo2Levels() throws Exception {
        Btn node = new Btn(3, new Btn(1), new Btn(5));
        Btn node2 = new Btn(3, new Btn(1), new Btn(5));
        assertEquals(0, node.compareTo(node2));
    }

    @Test
    public void testCompareTo3Levels() throws Exception {
        Btn node = new Btn(3, new Btn(2, new Btn(1), null), new Btn(5, new Btn(4), new Btn(7, null, new Btn(10))));
        Btn node2 = new Btn(3, new Btn(2, new Btn(1), null), new Btn(5, new Btn(4), new Btn(7, null, new Btn(10))));
        assertEquals(0, node.compareTo(node2));
    }

    @Test
    public void testCompareTo3LevelsNe() throws Exception {
        Btn node = new Btn(3, new Btn(2, new Btn(1), null), new Btn(5, new Btn(4), new Btn(7, null, new Btn(10))));
        Btn node2 = new Btn(3, new Btn(2, new Btn(-1), null), new Btn(5, new Btn(4), new Btn(7, null, new Btn(12))));
        assertNotEquals(0, node.compareTo(node2));
    }
}