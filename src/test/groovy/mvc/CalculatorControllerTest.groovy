package mvc

import spock.lang.Specification
import grails.testing.web.controllers.ControllerUnitTest

class CalculatorControllerTest extends Specification
        implements ControllerUnitTest<CalculatorController> {

    def "simple average of #en and #msp should be #result"() {
        when:
        def calcM = new CalculatorModel();
        calcM.en = 2.0
        calcM.msp = 4.0
        controller.calc(calcM)
        then:
        calcM.result == 3
    }
}
