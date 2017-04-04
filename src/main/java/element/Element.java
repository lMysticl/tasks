
package element;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Collection;
import java.util.stream.Collectors;

/** We have a class : class Element { int num; String name; int age; }
 * please implement java method taking Collection as an argument and
 * returning Collection where all elements are unique by "num" and age>20.
 * In case of ambiguity, put in target collection any of input elements.
 * @author putrenkov pavlo
 * */

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Element {

    private int num;
    private String name;
    private int age;

    public static Collection<Element> filterElements(Collection<Element> elements) {
        return elements.stream()
                .filter( e -> e.age > 20)
                .collect(Collectors.toMap(Element::getNum, el -> el, (e1, e2) -> e1)).values();
    }
}
