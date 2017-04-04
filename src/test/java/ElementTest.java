import element.Element;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
/**
 * @author putrenkov pavlo
 * */
public class ElementTest {

    @Test
    public void filterElements() throws Exception {
        List<Element> elements = Arrays.asList(
                new Element(1, "first", 14),
                new Element(2, "second", 98),
                new Element(2, "third", 22),
                new Element(4, "fourth", 77),
                new Element(5, "fifth", 3));
        ArrayList<Element> actual = new ArrayList<>(Element.filterElements(elements));

        List<Element> expected = Arrays.asList(
                new Element(2, "second", 98),
                new Element(4, "fourth", 77));

        assertEquals(expected, actual);
    }

    @Test
    public void filterElements2() throws Exception {
        List<Element> elements = Arrays.asList(
                new Element(1, "first", 16),
                new Element(2, "second", 9),
                new Element(2, "third", 21),
                new Element(4, "fourth", 49),
                new Element(5, "fifth", 11));
        ArrayList<Element> actual = new ArrayList<>(Element.filterElements(elements));

        List<Element> expected = Arrays.asList(
                new Element(2, "third", 21),
                new Element(4, "fourth", 49));

        assertEquals(expected, actual);
    }
}
