/*
 * This Spock specification was generated by the Gradle 'init' task.
 */
package com.al.invoicing

import spock.lang.Specification

class AppTest extends Specification {
    def "application has a greeting"() {
        setup:
        def app = new App() as java.lang.Object

        and:
        app.main()
    }
}
