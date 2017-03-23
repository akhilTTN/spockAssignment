import spock.lang.Specification

/**
 * Created by akhil on 21/3/17.
 */
class TestQ5 extends Specification {
    Q5 q;

    void setup() {
        q = new Q5();
    }

    void testGetCommon() {
        expect:
        q.getCommon(a as int[], b as int[]) == res
        where:
        a                  | b               | res
        [1, 2, 3, 4, 5, 6] | [5, 6, 8, 7, 9] | [5, 6]
    }
}
