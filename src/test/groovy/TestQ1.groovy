import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by akhil on 21/3/17.
 */
class TestQ1 extends Specification {
    Q1 o;

    void setup() {
        o = new Q1();
    }

    @Unroll
    void checkFunctionFindAndReplace() {
        expect:
        o.find_and_replace(data, s1, s2) == resultString

        where:

        data           | s1     | s2     | resultString
        "hahahihihaha" | "hihi" | "haha" | "hahahahahaha"
        "abcdefghijkl" | "abcd" | "xyz"  | "xyzefghijkl"
    }

}
