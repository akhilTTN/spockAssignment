import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by akhil on 21/3/17.
 */
class TestQ2 extends Specification {
    Q2 q;

    void setup() {
        q = new Q2();
    }

    @Unroll
    void testFunctionMerge() {
        expect:
        q.msort(string_arr as String[], 0 as int, end as int) == result as String[]

        where:
        string_arr                                         | end | result
        ["z", "a", "hi", "string", "this", "is"]           | 5   | ["a", "hi", "is", "string", "this", "z"]
        ["hello", "this", "is", "something", "to", "test"] | 5   | ["hello", "is", "something", "test", "this", "to"]
        [""]                                               | 0   | [""]
    }

    /* void testFunctionMerge2(){
         given:
         String s="";
         int a1=0;
         int a2=10;
         when:
         q2.msort(s, a1, a2)

         then:
         thrown(ArrayIndexOutOfBoundsException)
     }*/

}
