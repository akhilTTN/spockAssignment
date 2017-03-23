import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by akhil on 21/3/17.
 */
class TestQ3 extends Specification {
    Q3 q;

    void setup() {
        q = new Q3();
    }

    @Unroll
    void testCharOcc() {
        expect:
        q.charOccurance(string, chars as char, count) == counter

        where:
        string    | chars | count | counter
        "hello"   | 'l'   | 0     | 2
        "hahahah" | 'a'   | 0     | 3
    }
}
