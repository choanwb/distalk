import static ch.qos.logback.classic.Level.*

import ch.qos.logback.classic.filter.ThresholdFilter
import ch.qos.logback.core.rolling.RollingFileAppender
import ch.qos.logback.core.rolling.TimeBasedRollingPolicy

scan()

// See http://logback.qos.ch/manual/groovy.html for details on configuration
appender('CONSOLE', ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        pattern = "%d{ISO8601}|%-5p|%-20.20t|%-32.32c{32}| %X%m%n"
    }
    filter(ThresholdFilter) {
        level = WARN
    }
}

appender('ROLLING_FILE', RollingFileAppender) {
    file = '{{DISTALK_LOG_FILE}}'
    encoder(PatternLayoutEncoder) {
        pattern = "%d{ISO8601}|%-5p|%-20.20t|%-32.32c{32}| %X%m%n"
    }
    rollingPolicy(TimeBasedRollingPolicy) {
        fileNamePattern = '{{DISTALK_LOG_FILE}}.%d{yyyy-MM-dd}.gz'
        maxHistory = 14
    }
}

logger("org.hibernate", ERROR)
logger("org.hibernate.SQL", ERROR)
logger("org.hibernate.engine.internal", ERROR)
logger("grails.app.services.nl.anwb", DEBUG)
logger("grails.app.jobs.nl.anwb", DEBUG)
logger("nl.anwb", DEBUG)

root(INFO, ['ROLLING_FILE','CONSOLE'])

appender("FULL_STACKTRACE", FileAppender) {
    file = "logs/stacktrace.log"
    append = true
    encoder(PatternLayoutEncoder) {
        pattern = "%level %logger - %msg%n"
    }
}
logger("StackTrace", ERROR, ['FULL_STACKTRACE'], false)
