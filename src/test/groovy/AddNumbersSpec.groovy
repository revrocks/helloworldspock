import spock.lang.*

class Addition extends Specification {

    def "adding two numbers"() {
        given: 'an adder object'
        AddNumbers adder = new AddNumbers()

        when: 'numbers 2 and 3 are added'
        def actualResult = adder.addNumbers(2, 3)

        then: 'result should be five'
        def expResult = 5

        actualResult == expResult

    }

    def 'failed case'() {
        given: 'if one of the number is 5 - qualifies for failed case per adder obj'
        AddNumbers adder = new AddNumbers()
        when: 'numbers 5 and 6 are added'
        def ar = adder.addNumbers(5,6)
        then: 'result should be 11'
        def er = 11
        ar == er

    }

    def 'data driven addition'() {

        given: 'I have numbers a and b'
        def a = number1
        def b = number2
        when: 'I add a and b'
        AddNumbers an = new AddNumbers()
        def actualResult = an.addNumbers(a,b)
        then: 'added value should equal the expectation'
        def expectation = expectedResult

        where:

        number1|number2||expectedResult
        1      |2       ||3
        2      |3       ||5
        20     |30      ||50

    }
}