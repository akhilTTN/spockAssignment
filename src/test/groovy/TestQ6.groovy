import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by akhil on 23/3/17.
 */
class TestQ6 extends Specification {
    Q6 q;

    void setup() {
        q = new Q6();
    }

    @Unroll
    void testFindSingleChar() {
        expect:
        q.findSingleChar(s1 as String[]) == res

        where:
        s1                                                                          | res
        ["a", "a", "b", "b", "c", "c", "d"]                                         | "d"
        ["b", "b", "v", "v", "g", "g", "h", "h", "f", "f", "j", "d", "d", "r", "r"] | "j"

    }
}
