package piepeline.example

import piepeline.BasePipeline
import spock.lang.Specification
import spock.lang.Unroll
import util.Logger

//
/**
 * spock is BDD(Behaviour-Driven Development) based test framework
 * The advantages using spock is making the expected behavior and the intent of the test more clear
 */
class BasePipeline_Test_Spock_version extends Specification {
    BasePipeline basePipeline = new BasePipeline(this)

    void setup() {
        // This is called before every test suite.
        // Same as junit @BeforeEach
    }

    void tt() {
        Logger.info("tt: hello")
    }

    void "should demonstrate given-when-then"() {
        given:
        def polygon = new Polygon(4)

        when:
        int sides = polygon.numberOfSides

        // You can check the results of test code result verification, exceptions and conditions,
        // and the one line of code you write is an assert statement.
        then:
        sides == 4
    }

    void "test exception"() {
        given:
        def polygon = new Polygon(4)

        when:
        polygon.giveMeException()

        then:
        def e = thrown(InvalidClassException.class)
        e.message == 'test message'
    }

    int add(int ori, int addvalue) {
        return ori + addvalue
    }

    @Unroll
    void "SpockTestExample"() {
        given:
        def a = 1

        expect:
        b == add(a, c)

        where:
        c   |   b
        3   |   4
        7   |   8
        1  |    2
    }

    static class Polygon {
        private final int numberOfSides;

        Polygon(int numberOfSides) {
            this.numberOfSides = numberOfSides;
        }

        void giveMeException() {
            throw new InvalidClassException("test message")
        }
    }
}