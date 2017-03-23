import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by akhil on 23/3/17.
 */
class TestQ8 extends Specification {
    Q8 q;

    void setup() {
        q = new Q8();
    }


    @Unroll
    void testReverseString() {
        expect:
        q.reverseString(s1 as String) == res as String
        where:
        s1      | res
        "akhil" | "lihka"
        "nitin" | "nitin"
        "haha"  | "ahah"
    }
}
