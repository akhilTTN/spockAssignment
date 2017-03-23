import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by akhil on 21/3/17.
 */

class SampleSpec extends Specification {

    Demo d;

    void setup() {
        d = new Demo()
    }

    @Unroll
    void checksTheSome() {
        expect:
        d.sumofno(n1, n2) == res

        where:
        n1 | n2 | res
        1  | 2  | 3
        5  | 5  | 10
    }
}
