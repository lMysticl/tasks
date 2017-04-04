package btn;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
/** We have a class representing binary tree nodes: class BTN { int val; BTN left; BTN right;
 * }please implement Java method to compare 2 such
 * trees(returns: true if fully equal, false - otherwise)
 * @author putrenkov pavlo
 * */
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Btn implements Comparable<Btn>{
    private int val;
    private Btn left;
    private Btn right;

    public Btn(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    @Override
    public int compareTo(Btn o) {
        if (o == null) {
            return -1;
        }
        if (val != o.val) {
            return val - o.val;
        }
        int le = (left != null) ? left.compareTo(o.left) : o.left == null ? 0 : 1;
        int re = (right != null) ? right.compareTo(o.right) : o.right == null ? 0 : -1;

        return (le == 0 || re == 0) ? re + le : re * le;
    }

}