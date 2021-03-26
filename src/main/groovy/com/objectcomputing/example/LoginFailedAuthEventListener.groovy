package com.objectcomputing.example

import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.springframework.context.ApplicationListener
import org.springframework.security.authentication.event.AbstractAuthenticationFailureEvent
import org.springframework.security.web.authentication.WebAuthenticationDetails

@Slf4j
@CompileStatic
class LoginFailedAuthEventListener implements ApplicationListener<AbstractAuthenticationFailureEvent> {

    @Override
    void onApplicationEvent(AbstractAuthenticationFailureEvent event) {
        final Object username = event.authentication.principal
        final String remoteAddr = ((WebAuthenticationDetails) event.authentication.details).remoteAddress
        log.warn("Failed login attempt from {} for username {}", remoteAddr, username)
    }
}
