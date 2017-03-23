/**
 * Created by akhil on 21/3/17.
 */
import spock.lang.Specification
import spock.lang.Unroll

class TestQ4 extends Specification {
    Q4 sample;

    void setup() {
        sample = new Q4();
    }

    @Unroll
    void testLower() {
        expect:
        sample.countLower(str) == expectedResult

        where:
        str                   | expectedResult
        "Hello!MyDOBIs2909.!" | 6

    }

    void testUpper() {
        expect:
        sample.countUpper(str) == expectedResult

        where:
        str                   | expectedResult
        "Hello!MyDOBIs2909.!" | 6
    }

    void testDigit() {
        expect:
        sample.countDigit(str) == expectedResult

        where:
        str                   | expectedResult
        "Hello!MyDOBIs2909.!" | 4
    }

    void testSpecial() {
        expect:
        sample.countSpecial(str) == expectedResult

        where:
        str                   | expectedResult
        "Hello!MyDOBIs2909.!" | 3
    }
}