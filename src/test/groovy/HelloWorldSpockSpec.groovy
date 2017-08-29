import spock.lang.*

class HelloWorldSpockSpec extends Specification {

    def 'hello world concat spec'() {
        given: 'have two strings with values hello and world'
        def str1 = 'hello'
        def str2 = 'world'

        when: 'I concat the two strings'

        def concatedString = str1.concat str2

        then: 'the concated string should be helloworld'

        def expVal = 'helloworld'

        concatedString == expVal

    }
}
