package mvc

import spock.lang.Specification
import grails.testing.web.controllers.ControllerUnitTest

class CalculatorControllerTest extends Specification implements ControllerUnitTest<CalculatorController> {
    def "simple average of #en and #msp should be #result"() {
        when:
        controller.calc(2.0, 4.0)
        then:
        model.result == 3
    }
}
