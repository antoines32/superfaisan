package superfaisant

import grails.testing.web.interceptor.InterceptorUnitTest
import spock.lang.Specification

class AuthenticateInterceptorSpec extends Specification implements InterceptorUnitTest<AuthenticateInterceptor> {

    def setup() {
    }

    def cleanup() {

    }

    void "Test authenticate interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"authenticate")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
